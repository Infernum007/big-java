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
        theLock.lock();
        try {
            return currentSize;
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
     * Adds an element after a given position.
     *
     * @param pos        the position
     * @param newElement the element to add
     */
    public boolean add(final int pos, final Object newElement) {
        theLock.lock();
        try {
            growIfNecessary();
            currentSize++;
            checkBounds(pos);
            for (int i = currentSize - 1; i > pos; i--) {
                elements[i] = elements[i - 1];
            }
            elements[pos] = newElement;
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
            growIfNecessary();
            currentSize++;
            elements[currentSize - 1] = newElement;
            return true;
        } finally {
            theLock.unlock();
        }
    }

    @Override
    public String toString() {
        theLock.lock();
        try {
            return Arrays.stream(this.elements, 0, this.size())
                    .map(Object::toString)
                    .collect(Collectors.joining(", ", "[", "]"));
        } finally {
            theLock.unlock();
        }
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
