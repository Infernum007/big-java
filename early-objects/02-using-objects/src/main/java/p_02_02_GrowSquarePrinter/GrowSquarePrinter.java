package p_02_02_GrowSquarePrinter;

import java.awt.*;

/**
 * Write a {@code GrowSquarePrinter} program that constructs a {@code Rectangle}
 * object {@code square} representing a square with top-left corner (100, 100)
 * and side length 50, prints its location by calling {@code System.out.println
 * (square)}, applies the {@code translate} and {@code grow} methods, and calls
 * {@code System.out.println(square)} again. The calls to {@code translate} and
 * {@code grow} should modify the square so that it has twice the size and the
 * same top-left corner as the original. If the squares were drawn, they would
 * look like the figure at right.
 * <p>
 * Your program will not produce a drawing. It will simply print the locations
 * of {@code square} before and after calling the mutator methods.
 * <p>
 * Look up the description of the {@code grow} method in the API documentation.
 */
public class GrowSquarePrinter
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(100, 100, 50, 50);
        System.out.println(box);

        box.grow(25, 25);
        box.translate(25, 25);
        System.out.println(box);
    }
}
