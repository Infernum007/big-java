package e_02_02_Perimeter;

import java.awt.*;

/**
 * Write a {@code PerimeterTester} program that constructs a {@code Rectangle}
 * object and then computes and prints its perimeter. Use the {@code getWidth}
 * and {@code getHeight} methods. Also print the expected answer.
 */
public class PerimeterTester
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(300, 100);

        double perimeter =
                (rectangle.getWidth() * 2) + (rectangle.getHeight() * 2);

        System.out.printf("Rectangle perimeter: %,.2f%n", perimeter);
        System.out.printf("Expected: %,.2f", (300.0 * 2 + 100 * 2));
    }
}
