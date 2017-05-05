package e_03_01_AddButton;

/**
 * We want to add a button to the tally counter in Section 3.1 that allows an
 * operator to undo an accidental button click. Provide a method
 * <pre>
 *      public void undo()
 * </pre>
 * that simulates such a button. As an added precaution, make sure that
 * clicking the undo button more often than the click button has no effect.
 * (Hint: The call {@code Math.max(n, 0)} returns {@code n} if {@code n} is
 * greater than zero, zero otherwise.)
 */
public class CounterDemo
{
    public static void main(String[] args)
    {
        Counter tally = new Counter();
        tally.click();
        tally.click();
        tally.click();

        tally.undo();
        tally.undo();

        int result = tally.getValue(); // Sets result to 1
        System.out.print("result: ");
        System.out.println(result);
    }
}
