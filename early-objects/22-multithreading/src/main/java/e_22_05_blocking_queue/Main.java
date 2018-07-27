package e_22_05_blocking_queue;

import java.util.Scanner;

/**
 * Reimplement Exercise E22.4 by using the {@code ArrayBlockingQueue} class
 * from the standard library.
 */
public class Main
{
    private static int QUEUE_MAX_SIZE = 5;
    private static int NUM_OF_ITERATION = 100;

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of threads for Producer and Consumer: ");
        final int threads = in.nextInt();

        MyQueue q = new MyQueue(QUEUE_MAX_SIZE);

        for (int i = 0; i < threads; i++) {
            ProducerThread producer = new ProducerThread(q, NUM_OF_ITERATION);
            ConsumerThread consumer = new ConsumerThread(q, NUM_OF_ITERATION);
            producer.start();
            consumer.start();
        }
    }
}
