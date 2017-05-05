package e_03_12_Bug;

/**
 * Test the {@code Bug} class.
 */
public class BugTester
{
    public static void main(String[] args)
    {
        Bug bugsy = new Bug(10);

        bugsy.move();
        bugsy.turn();
        bugsy.move();
        bugsy.turn();
        bugsy.move();

        System.out.println("Current position: " + bugsy.getPosition());
        System.out.println("Expected position: 11");
    }
}
