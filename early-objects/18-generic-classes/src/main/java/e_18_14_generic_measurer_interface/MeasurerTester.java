package e_18_14_generic_measurer_interface;

import java.awt.*;

/**
 * Make the {@code Measurer} interface from Chapter 10 into a generic class.
 * Provide a static method {@code T max(T[] values, Measurer<T> meas)}.
 */
public class MeasurerTester
{
    public static void main(String[] args)
    {
        Rectangle[] rects = new Rectangle[]{
                new Rectangle(5, 10, 20, 30),
                new Rectangle(10, 20, 30, 40),
                new Rectangle(20, 30, 5, 15)
        };

        Measurer<Rectangle> areaMeas = new AreaMeasurer<>();

        // Measure the average area of the objects
        double averageArea = Data.average(rects, areaMeas);
        System.out.println("Average area: " + averageArea);
        System.out.println("Expected: 625");

        // Measure rectangle with maximum area
        Rectangle maxArea = Data.max(rects, areaMeas);
        System.out.println("Max area: " + maxArea);
        System.out.println("Expected: " + rects[1]);
    }
}
