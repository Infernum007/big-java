package e_22_03_queue;

import java.util.Date;

/**
 * This class will keep putting things into the queue.
 */
public class ProducerThread extends Thread
{
    private static final int DELAY = 1;
    private Queue queue;
    private int count;
    /**
     * Constructs the producer with a queue and count.
     *
     * @param aQueue the queue that the consumer going to consume from
     * @param aCount the number of time that consumer going to consume
     */
    public ProducerThread(Queue aQueue, int aCount)
    {
        count = aCount;
        queue = aQueue;
    }

    public void run()
    {
        try {
            for (int i = 0; i < count && !isInterrupted(); i++) {
                String item = new Date().toString();
                System.out.println("Producer: " + item);
                queue.add(item);
                sleep(DELAY);
            }
        }
        catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
