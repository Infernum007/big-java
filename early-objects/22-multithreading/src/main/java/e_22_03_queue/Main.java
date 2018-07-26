package e_22_03_queue;

/**
 * This program demonstrates how to handle the classic race condition
 * problem, consumer and producer.
 */
public class Main
{
    private static int QUEUE_MAX_SIZE = 4;
    private static int NUM_OF_ITERATION = 1000;

    public static void main(String args[])
    {
        Queue q = new Queue(QUEUE_MAX_SIZE);
        ProducerThread producer = new ProducerThread(q, NUM_OF_ITERATION);
        ConsumerThread consumer = new ConsumerThread(q, NUM_OF_ITERATION);
        producer.start();
        consumer.start();

        System.out.println("Queue is empty: " + q.isEmpty());
    }
}
