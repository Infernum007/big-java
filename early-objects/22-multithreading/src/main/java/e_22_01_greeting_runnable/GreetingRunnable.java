package e_22_01_greeting_runnable;

import java.util.Date;

/**
 * A runnable that repeatedly prints a greeting.
 */
public class GreetingRunnable implements Runnable
{
    private static final int REPETITIONS = 10;
    private static final int DELAY = 100;

    private String greeting;

    public GreetingRunnable(final String aGreeting)
    {
        greeting = aGreeting;
    }

    @Override
    public void run()
    {
        try {
            for (int i = 1; i < REPETITIONS; i++) {
                Date now = new Date();
                System.out.println(now + " " + greeting);
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
