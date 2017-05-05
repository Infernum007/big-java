package e_03_13_Moth;

/**
 * Implement a class {@code Moth} that models a moth flying along a straight
 * line. The moth has a position, which is the distance from a fixed origin.
 * When the moth moves toward a point of light, its new position is halfway
 * between its old position and the position of the light source.
 * Supply a constructor
 * <p><pre>
 *      public Moth(double initialPosition)</pre>
 * and methods
 * <p><pre>
 *      public void moveToLight(double lightPosition)
 *      public double getPosition()</pre>
 * Your {@code MothTester} should construct a moth, move it toward a couple of
 * light sources, and check that the moth's position is as expected.
 */
public class Moth
{
    private double position;

    /**
     * Constructs a moth with initial position parameter.
     *
     * @param initialPosition initial position
     */
    Moth(double initialPosition)
    {
        position = initialPosition;
    }

    /**
     * Moves moth toward a point of light.
     *
     * @param lightPosition the position of light
     */
    void moveToLight(double lightPosition)
    {
        position = position + ((lightPosition - position) / 2);
    }

    /**
     * Gets current position of moth.
     *
     * @return the moth position
     */
    double getPosition()
    {
        return position;
    }
}
