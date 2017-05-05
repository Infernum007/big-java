package p_02_09_LineDistanceTester;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Repeat Exercise P2.8, but now write a graphical application that shows
 * the line and the points. Draw each point as a tiny circle. Use the {@code
 * drawString} method to draw each distance next to the point, using calls
 * <p><pre>
 *      g2.drawString("Distance: " + distance, p.getX(), p.getY());</pre>
 */
public class LineDistanceComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Point2D.Double p1 = new Point2D.Double(100, 100);
        Point2D.Double p2 = new Point2D.Double(200, 200);
        Line2D.Double line = new Line2D.Double(p1, p2);

        Point2D.Double d1 = new Point2D.Double(100, 200);
        Point2D.Double d2 = new Point2D.Double(150, 150);
        Point2D.Double d3 = new Point2D.Double(250, 50);

        Ellipse2D.Double cp1 = new Ellipse2D.Double(96, 96, 8, 8);
        Ellipse2D.Double cp2 = new Ellipse2D.Double(196, 196, 8, 8);

        Ellipse2D.Double cd1 = new Ellipse2D.Double(96, 196, 8, 8);
        Ellipse2D.Double cd2 = new Ellipse2D.Double(146, 146, 8, 8);
        Ellipse2D.Double cd3 = new Ellipse2D.Double(246, 46, 8, 8);

        g2.draw(line);
        g2.draw(cp1);
        g2.draw(cp2);

        g2.draw(cd1);
        g2.draw(cd2);
        g2.draw(cd3);

        g2.drawString("Distance: " + line.ptSegDist(d1), (int) d1.getX() + 12, (int) d1.getY() + 20);

        g2.drawString("Distance: " + line.ptSegDist(d2), (int) d2.getX() + 7, (int) d2.getY() - 10);

        g2.drawString("Distance: " + line.ptSegDist(d3), (int) d3.getX() + 7, (int) d3.getY() - 7);
    }
}
