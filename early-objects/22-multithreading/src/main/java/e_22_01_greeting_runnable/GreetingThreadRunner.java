package e_22_01_greeting_runnable;

import ch_22_01_greeting_runnable.GreetingRunnable;

/**
 * Run a program with the following instructions:
 * <p><pre>
 *      GreetingRunnable r1 = new GreetingRunnable("Hello");
 *      GreetingRunnable r2 = new GreetingRunnable("Goodbye");
 *      r1.run();
 *      r2.run();</pre>
 * Note that the threads don’t run in parallel. Explain.
 */
public class GreetingThreadRunner
{
    public static void main(String[] args)
    {
        GreetingRunnable r1 = new GreetingRunnable("Hello");
        GreetingRunnable r2 = new GreetingRunnable("Goodbye");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.run();
        t2.run();
    }
}
