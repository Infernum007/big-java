package e_22_04_custom_number_of_threads;

import java.util.Scanner;

/**
 * Enhance the program of Exercise E22.3 by supplying a variable number of
 * producer and consumer threads. Prompt the program user for the numbers.
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

        Queue q = new Queue(QUEUE_MAX_SIZE);

        for (int i = 0; i < threads; i++) {
            ProducerThread producer = new ProducerThread(q, NUM_OF_ITERATION);
            ConsumerThread consumer = new ConsumerThread(q, NUM_OF_ITERATION);
            producer.start();
            consumer.start();
        }
    }
}
