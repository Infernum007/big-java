package e_02_13_PointDistance;

import java.awt.*;

/**
 * Look at the API of the {@code Point} class and find out how to construct a
 * {@code Point} object. In a {@code PointTester} program, construct two points
 * with coordinates (3, 4) and (–3, –4). Find the distance between them, using
 * the {@code distance} method. Print the distance, as well as the expected
 * value. (Draw a sketch on graph paper to find the value you will expect.)
 */
public class PointTester
{
    public static void main(String[] args)
    {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-3, -4);

        System.out.println(p1.distance(p2));
    }
}
