package e_03_01_AddButton;

/**
 * We want to add a button to the tally counter in Section 3.1 that allows an
 * operator to undo an accidental button click. Provide a method
 * <pre>
 *      public void undo()</pre>
 * that simulates such a button. As an added precaution, make sure that
 * clicking the undo button more often than the click button has no effect.
 * (Hint: The call {@code Math.max(n, 0)} returns {@code n} if {@code n} is
 * greater than zero, zero otherwise.)
 */
public class Counter
{
    private int value;

    /**
     * Gets the current value of this counter.
     *
     * @return the current value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Advances the value of this counter by 1.
     */
    public void click()
    {
        value = value + 1;
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
