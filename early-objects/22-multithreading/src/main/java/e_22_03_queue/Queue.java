package e_22_03_queue;

import java.util.ArrayList;

/**
 * Implement a {@code Queue} class whose add and remove methods are synchronized.
 * Supply one thread, called the producer, which keeps inserting strings into
 * the queue as long as there are fewer than ten elements in it. When the queue
 * gets too full, the thread waits. As sample strings, simply use time stamps
 * {@code new Date().toString()}. Supply a second thread, called the consumer,
 * that keeps removing and printing strings from the queue as long as the queue
 * is not empty. When the queue is empty, the thread waits. Both the consumer
 * and producer threads should run for 100 iterations.
 */
public class Queue
{
    private static final int DEFAULT_SIZE = 10;
    private ArrayList queue;
    private int size;

    /**
     * Constructs the maximum size of the queue to default size.
     */
    public Queue()
    {
        size = DEFAULT_SIZE;
        queue = new ArrayList(size);
    }

    /**
     * Constructs the maximum size of the queue to the given size.
     *
     * @param aSize the maximum size of the queue
     */
    public Queue(int aSize)
    {
        size = aSize;
        queue = new ArrayList(size);
    }

    /**
     * Adds a string into the queue.
     *
     * @param item the item to add
     */
    @SuppressWarnings("unchecked")
    public synchronized void add(String item) throws InterruptedException
    {
        while (isFull()) {
            wait();
        }
        queue.add(item);
        notifyAll();    // notify all others that the queue is not empty
    }

    /**
     * Removes one item from the queue.
     *
     * @return the first item of the queue
     */
    public synchronized String remove() throws InterruptedException
    {
        while (isEmpty()) {
            wait();
        }
        notifyAll();    // notify all others that the queue is not full
        return queue.remove(0).toString();
    }

    /**
     * Check if the queue is empty.
     *
     * @return true if the queue is empty, else false
     */
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    /**
     * Check if the queue is full.
     *
     * @return true if queue size equals to maximum size, else false
     */
    public boolean isFull()
    {
        return queue.size() == size;
    }
}
