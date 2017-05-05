package e_03_02_LimitCounter;

/**
 * Simulate a tally counter that can be used to admit a limited number of
 * people. First, the limit is set with a call
 * <pre>
 *      public void setLimit(int maximum)</pre>
 * If the click button is clicked more often than the limit, it has no effect.
 * (Hint: The call {@code Math.min(n, limit)} returns {@code n} if {@code n} is
 * less than {@code limit}, and {@code limit} otherwise.).
 */
public class Counter
{
    private int value;
    private int limit;

    /**
     * Gets the current value of this counter.
     *
     * @return the current value
     */
    public int getValue()
    {
        return value;
    }

    public void setLimit(int maximum)
    {
        limit = maximum;
    }

    /**
     * Advances the value of this counter by 1.
     */
    public void click()
    {
        value = Math.min(value + 1, limit);
    }

    /**
     * Undo the click by minus one.
     */
    public void undo()
    {
        value = Math.max(value - 1, 0);
    }

    /**
     * Resets the value of this counter to 0.
     */
    public void reset()
    {
        value = 0;
    }
}
