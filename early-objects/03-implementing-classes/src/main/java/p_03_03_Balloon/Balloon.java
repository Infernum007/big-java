package p_03_03_Balloon;

/**
 * Implement a class {@code Balloon}. A balloon starts out with radius 0.
 * Supply a method
 * <p><pre>
 *      public void inflate(double amount)</pre>
 * that increases the radius by the given amount. Supply a method
 * <p><pre>
 *      public double getVolume()</pre>
 * that returns the current volume of the balloon. Use {@code Math.PI} for the
 * value of {@code π}. To compute the cube of a value {@code r}, just use
 * {@code r * r * r}.
 */
public class Balloon
{

    private double radius;

    /**
     * Constructs a balloon with 0 radius.
     */
    Balloon()
    {
        radius = 0;
    }

    /**
     * Increases the radius of balloon by the given amount.
     *
     * @param amount amount to increase the radius
     */
    void inflate(double amount)
    {
        radius += amount;
    }

    /**
     * Computes the current volume of the balloon.
     *
     * @return the volume of the balloon
     */
    double getVolume()
    {
        return (4.0 / 3) * Math.PI * (radius * radius * radius);
    }
}
