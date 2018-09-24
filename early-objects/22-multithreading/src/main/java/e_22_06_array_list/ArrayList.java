package e_22_06_array_list;

import java.util.concurrent.locks.Lock;

/**
 * Modify the {@code ArrayList} implementation of Section 16.2 so that all
 * methods can be safely accessed from multiple threads.
 */
public class ArrayList {

    private Object[] elements;
    private int currentSize;
    private Lock theLock;

    /**
     * Constructs an empty array list.
     */
    public ArrayList(final Object[] elements, final Lock aLock) {
        this.elements = elements;
        this.currentSize = this.elements.length;
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
    public Object get(int pos) {
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
    public void set(int pos, Object element) {
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
    public Object remove(int pos) {
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
    public boolean add(int pos, Object newElement) {
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
    public boolean addLast(Object newElement) {
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
            StringBuilder result = new StringBuilder();
            for (Object s : elements) {
                if (s != null) {
                    result.append(s.toString()).append(", ");
                }
            }
            return result.toString();
        } finally {
            theLock.unlock();
        }
    }

    /**
     * Grows the elements array if the current size equals the capacity.
     */
    private void growIfNecessary() {
        if (currentSize == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
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
