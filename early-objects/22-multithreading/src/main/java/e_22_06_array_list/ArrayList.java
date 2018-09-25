package e_22_06_array_list;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
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
        theLock.lock();
        try {
            return elements.length;
        } finally {
            theLock.unlock();
        }
    }

    /**
     * Gets the element at a given position.
     *
     * @param pos the position
     * @return the element at pos
     */
    public Object get(final int pos) {
        theLock.lock();
        try {
            checkBounds(pos);
            return elements[pos];
        } finally {
            theLock.unlock();
        }
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
            checkBounds(pos);
            elements[pos] = element;
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
            checkBounds(pos);
            Object removed = elements[pos];
            for (int i = pos + 1; i < currentSize; i++) {
                elements[i - 1] = elements[i];
            }
            currentSize--;
            return removed;
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
        theLock.lock();
        try {
            return Arrays.stream(getElements(), 0, this.size())
                    .map(Object::toString)
                    .collect(Collectors.joining(", ", "[", "]"));
        } finally {
            theLock.unlock();
        }
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

    /**
     * Thread safe increment of this array's current size
     *
     * @param currentSize the current size of this array
     */
    private void incrementCurrentSize(final int currentSize) {
        theLock.lock();
        try {
            this.currentSize = currentSize + 1;
        } finally {
            theLock.unlock();
        }
    }

    /**
     * Grows the elements array if the current size equals the capacity.
     */
    private void growIfNecessary() {
        final int elementsLength = elements.length;
        if (this.size() == elementsLength) {
            final Object[] newElements = new Object[2 * elementsLength];
            System.arraycopy(elements, 0, newElements, 0, elementsLength);
            elements = newElements;
        }
    }

    /**
     * Throws an IndexOutOfBoundsException if the checked index is out of bounds
     *
     * @param n the index to check
     */
    private void checkBounds(int n) {
        if (n < 0 || n >= currentSize) {
            throw new IndexOutOfBoundsException();
        }
    }

}
