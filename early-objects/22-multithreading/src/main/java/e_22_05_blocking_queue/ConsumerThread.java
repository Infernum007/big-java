package e_22_05_blocking_queue;

/**
 * This class will keep removing things from the myQueue.
 */
public class ConsumerThread extends Thread
{
    private static final int DELAY = 1;
    private MyQueue myQueue;
    private int count;
    /**
     * Constructs the consumer with a myQueue and count.
     *
     * @param aMyQueue the myQueue that the consumer going to consume from
     * @param aCount  the number of time that consumer going to consume
     */
    public ConsumerThread(MyQueue aMyQueue, int aCount)
    {
        count = aCount;
        myQueue = aMyQueue;
    }

    public void run()
    {
        try {
            for (int i = 0; i < count && !isInterrupted(); i++) {
                System.out.println("Consumer: " + myQueue.remove());
                sleep(DELAY);
            }
        }
        catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
