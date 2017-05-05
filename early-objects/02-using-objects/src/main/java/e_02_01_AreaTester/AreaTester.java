package e_02_01_AreaTester;

import java.awt.*;

/**
 * Write an {@code AreaTester} program that constructs a {@code Rectangle}
 * object and then computes and prints its area. Use the {@code getWidth}
 * and {@code getHeight} methods. Also print the expected answer.
 */
public class AreaTester
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(100, 300);

        double area = rectangle.getWidth() * rectangle.getHeight();

        System.out.printf("Rectangle area: %,.2f%n", area);
        System.out.printf("Expected: %,.2f", (100.0 * 300));
    }
}
