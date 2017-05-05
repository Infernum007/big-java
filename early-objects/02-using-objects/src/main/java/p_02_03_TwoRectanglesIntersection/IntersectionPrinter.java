package p_02_03_TwoRectanglesIntersection;

import java.awt.*;

/**
 * The {@code intersection} method computes the <em>intersection</em> of two
 * rectangles — that is, the rectangle that would be formed by two overlapping
 * rectangles if they were drawn, as shown at right.
 * <p>
 * You call this method as follows:
 * <p><pre>
 *      {@code Rectangle r3 = r1.intersection(r2);}
 * <p><pre>
 * Write a program {@code IntersectionPrinter} that constructs two rectangle
 * objects, prints them as described in Exercise P2.1, and then prints the
 * rectangle object that describes the intersection. Then the program should
 * print the result of the {@code intersection} method when the rectangles do
 * not overlap. Add a comment to your program that explains how you can tell
 * whether the resulting rectangle is empty.
 */
public class IntersectionPrinter
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(0, 0, 100, 300);
        Rectangle r2 = new Rectangle(50, 50, 100, 300);
        Rectangle r3 = new Rectangle(125, 325, 100, 300);

        Rectangle r4 = r1.intersection(r2);
        System.out.println("Intersection result: " + r4);

        Rectangle r5 = r1.intersection(r3);
        System.out.println("Intersection result: " + r5);
    }
}
