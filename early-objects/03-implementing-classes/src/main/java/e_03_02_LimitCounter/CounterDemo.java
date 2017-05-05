package e_03_02_LimitCounter;

/**
 * Simulate a tally counter that can be used to admit a limited number of
 * people. First, the limit is set with a call
 * <pre>
 *      public void setLimit(int maximum)
 * </pre>
 * If the click button is clicked more often than the limit, it has no effect.
 * (Hint: The call {@code Math.min(n, limit)} returns {@code n} if {@code n} is
 * less than {@code limit}, and {@code limit} otherwise.).
 */
public class CounterDemo
{
    public static void main(String[] args)
    {
        Counter tally = new Counter();

        tally.setLimit(5);

        tally.click();
        tally.click();
        tally.click();

        tally.click();
        tally.click();
        tally.click();

        int result = tally.getValue(); // Sets result to 5
        System.out.print("result: ");
        System.out.println(result);
    }
}
