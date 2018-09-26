package e_22_06_array_list;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.stream.Collectors;

/**
 * Modify the {@code ArrayList} implementation of Section 16.2 so that all
 * methods can be safely accessed from multiple threads.
 */
public class ArrayList {

    private Object[] elements;
    private int currentSize;
    private final Lock theLock;

    /**
     * Constructs an empty array list.
     */
    public ArrayList(final Object[] elements, final Lock aLock) {
        this.elements = elements;
        this.currentSize = elements.length;
        this.theLock = aLock;
    }

    /**
     * Gets the size of this array list.
     *
     * @return the size
     */
    public int size() {
        return getElements().length;
    }

    /**
     * Gets the element at a given position.
     *
     * @param pos the position
     * @return the element at pos
     */
    public Object get(final int pos) {
        return get(getElements(), pos);
    }

    /**
     * Gets the element at a given position.
     *
     * @param pos the position
     * @return the element at pos
     */
    public Object get(Object[] arr, final int pos) {
        return arr[pos];
    }

    /**
     * Sets the element at a given position.
     *
     * @param pos     the position
     * @param element the new value
     */
    public void set(final int pos, final Object element) {
        theLock.lock();
        try {
            Object[] elements = getElements();
            Object oldValue = get(elements, pos);

            if (oldValue != element) {
                int len = elements.length;
                Object[] newElements = Arrays.copyOf(elements, len);
                newElements[pos] = element;
                setElements(newElements);
            } else {
                setElements(elements);
            }
        } finally {
            theLock.unlock();
        }
    }

    /**
     * Removes the element at a given position.
     *
     * @param pos the position
     * @return the removed element
     */
    public Object remove(final int pos) {
        theLock.lock();
        try {
            final Object[] elements = getElements();
            final int len = elements.length;

            if (pos < 0 || pos > len) {
                throw new IndexOutOfBoundsException("pos: " + pos + ", len: " + len);
            }

            Object removedElement = get(elements, pos);

            int numMoved = len - pos - 1;
            if (numMoved == 0) {
                setElements(Arrays.copyOf(elements, len - 1));
            } else {
                Object[] newElements = new Object[len - 1];
                System.arraycopy(elements, 0, newElements, 0, pos);
                System.arraycopy(elements, pos + 1, newElements, pos, numMoved);
                setElements(newElements);
            }
            return removedElement;
        } finally {
            theLock.unlock();
        }
    }

    /**
     * Adds an element at a given position.
     *
     * @param pos        the position
     * @param newElement the element to add
     */
    public boolean add(final int pos, final Object newElement) {
        theLock.lock();
        try {
            final Object[] elements = getElements();
            int len = elements.length;

            if (pos < 0 || pos > len) {
                throw new ArrayIndexOutOfBoundsException("pos: " + pos + ", size: " + len);
            }

            Object[] newElements;
            int numMoved = len - pos;
            if (numMoved == 0) {
                newElements = Arrays.copyOf(elements, len + 1);
            } else {
                newElements = new Object[len + 1];
                System.arraycopy(elements, 0, newElements, 0, pos);
                System.arraycopy(elements, pos, newElements, pos + 1, numMoved);
            }
            newElements[pos] = newElement;
            setElements(newElements);
            return true;
        } finally {
            theLock.unlock();
        }
    }

    /**
     * Adds an element after the end of the array list
     *
     * @param newElement the element to add
     */
    public boolean addLast(final Object newElement) {
        theLock.lock();
        try {
            final Object[] arr = getElements();
            int len = arr.length;
            Object[] newArr = Arrays.copyOf(arr, len + 1);
            newArr[len] = newElement;
            setElements(newArr);
            return true;
        } finally {
            theLock.unlock();
        }
    }

    @Override
    public String toString() {
        return Arrays.stream(getElements(), 0, this.size())
                .map(Object::toString)
                .collect(Collectors.joining(", ", "[", "]"));
    }

    /**
     * Gets the elements. Created mostly for testing purpose.
     *
     * @return array of elements
     */
    final Object[] getElements() {
        return elements;
    }

    /**
     * Sets the array.
     *
     * @param newElements array of new elements
     */
    final void setElements(final Object[] newElements) {
        elements = newElements;
    }

}
