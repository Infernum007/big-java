package e_22_04_custom_number_of_threads;

/**
 * This class will keep removing things from the queue.
 */
public class ConsumerThread extends Thread
{
    private static final int DELAY = 1;
    private Queue queue;
    private int count;
    /**
     * Constructs the consumer with a queue and count.
     *
     * @param aQueue the queue that the consumer going to consume from
     * @param aCount  the number of time that consumer going to consume
     */
    public ConsumerThread(Queue aQueue, int aCount)
    {
        count = aCount;
        queue = aQueue;
    }

    public void run()
    {
        try {
            for (int i = 0; i < count && !isInterrupted(); i++) {
                System.out.println("Consumer: " + queue.remove());
                sleep(DELAY);
            }
        }
        catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
