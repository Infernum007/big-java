package e_03_13_Moth;

/**
 * Test {@code Moth} class.
 */
public class MothTester
{

    public static void main(String[] args)
    {
        Moth moth = new Moth(50);

        System.out.println("Current moth position: " + moth.getPosition());

        moth.moveToLight(100);

        System.out.println("Current moth position: " + moth.getPosition());

        moth.moveToLight(100);

        System.out.println("Current moth position: " + moth.getPosition());

        moth.moveToLight(100);

        System.out.println("Current moth position: " + moth.getPosition());
    }
}
