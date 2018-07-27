package e_22_05_blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Implement a {@code MyQueue} class whose add and remove methods are synchronized.
 * Supply one thread, called the producer, which keeps inserting strings into
 * the queue as long as there are fewer than ten elements in it. When the queue
 * gets too full, the thread waits. As sample strings, simply use time stamps
 * {@code new Date().toString()}. Supply a second thread, called the consumer,
 * that keeps removing and printing strings from the queue as long as the queue
 * is not empty. When the queue is empty, the thread waits. Both the consumer
 * and producer threads should run for 100 iterations.
 */
public class MyQueue
{
    private static final int DEFAULT_SIZE = 10;
    private BlockingQueue queue;
    private int size;

    /**
     * Constructs the maximum size of the queue to default size.
     */
    public MyQueue()
    {
        size = DEFAULT_SIZE;
        queue = new ArrayBlockingQueue(size);
    }

    /**
     * Constructs the maximum size of the queue to the given size.
     *
     * @param aSize the maximum size of the queue
     */
    public MyQueue(int aSize)
    {
        size = aSize;
        queue = new ArrayBlockingQueue(size);
    }

    /**
     * Adds a string into the queue.
     *
     * @param item the item to add
     */
    @SuppressWarnings("unchecked")
    public void add(String item) throws InterruptedException
    {
        queue.put(item);
    }

    /**
     * Removes one item from the queue.
     *
     * @return the first item of the queue
     */
    public String remove() throws InterruptedException
    {
        return queue.take().toString();
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
