package e_03_12_Bug;

/**
 * Write a class {@code Bug} that models a bug moving along a horizontal line.
 * The bug moves either to the right or left. Initially, the bug moves to the
 * right, but it can turn to change its direction. In each move, its position
 * changes by one unit in the current direction. Provide a constructor
 * <p><pre>
 *      public Bug(int initialPosition)</pre>
 * and methods
 * <p><pre>
 *      public void turn()
 *      public void move()
 *      public int getPosition()</pre>
 * Sample usage:
 * <p><pre>
 *      Bug bugsy = new Bug(10);
 *      bugsy.move(); // Now the position is 11
 *      bugsy.turn();
 *      bugsy.move(); // Now the position is 10</pre>
 * Your {@code BugTester} should construct a bug, make it move and turn a few
 * times, and print the actual and expected position.
 */
public class Bug
{
    private int position;

    /**
     * Constructs a bug with initial position as parameter.
     *
     * @param initialPosition the initial position
     */
    Bug(int initialPosition)
    {
        position = initialPosition;
    }

    /**
     * Turns a bug to change its direction.
     */
    void turn()
    {
        position = position * (-1);
    }

    /**
     * Moves a bug by one unit.
     */
    void move()
    {
        position++;
    }

    /**
     * Gets current position of the bug.
     *
     * @return current position
     */
    int getPosition()
    {
        return position;
    }
}
