package p_02_08_LineDistanceTester;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Write a program {@code LineDistanceTester} that constructs a line joining the
 * points (100, 100) and (200, 200), then constructs points (100, 200),
 * (150, 150), and (250, 50). Print the distance from the line to each of the
 * three points, using the {@code ptSegDist} method of the {@code Line2D} class.
 * Also print the expected values. (Draw a sketch on graph paper to find what
 * values you expect.)
 */
public class LineDistanceTester
{
    public static void main(String[] args)
    {
        Point2D.Double p1 = new Point2D.Double(100, 100);
        Point2D.Double p2 = new Point2D.Double(200, 200);
        Line2D.Double line = new Line2D.Double(p1, p2);

        Point2D.Double d1 = new Point2D.Double(100, 200);
        Point2D.Double d2 = new Point2D.Double(150, 150);
        Point2D.Double d3 = new Point2D.Double(250, 50);

        System.out.println(line.ptSegDist(d1));
        System.out.println(line.ptSegDist(d2));
        System.out.println(line.ptSegDist(d3));
    }
}
