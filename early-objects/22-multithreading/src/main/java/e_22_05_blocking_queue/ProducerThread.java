package e_22_05_blocking_queue;

import java.util.Date;

/**
 * This class will keep putting things into the myQueue.
 */
public class ProducerThread extends Thread
{
    private static final int DELAY = 1;
    private MyQueue myQueue;
    private int count;
    /**
     * Constructs the producer with a myQueue and count.
     *
     * @param aMyQueue the myQueue that the consumer going to consume from
     * @param aCount the number of time that consumer going to consume
     */
    public ProducerThread(MyQueue aMyQueue, int aCount)
    {
        count = aCount;
        myQueue = aMyQueue;
    }

    public void run()
    {
        try {
            for (int i = 0; i < count && !isInterrupted(); i++) {
                String item = new Date().toString();
                System.out.println("Producer: " + item);
                myQueue.add(item);
                sleep(DELAY);
            }
        }
        catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
