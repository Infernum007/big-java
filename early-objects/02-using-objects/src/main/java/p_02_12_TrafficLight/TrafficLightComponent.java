package p_02_12_TrafficLight;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Write a graphical program that draws a traffic light.
 */
public class TrafficLightComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        int[] xPoints = {90, 150, 210};
        int[] yPoints = {100, 80, 100};

        g2.setColor(Color.DARK_GRAY);

        Polygon top = new Polygon(xPoints, yPoints, 3);
        g2.fill(top);
        g2.draw(top);

        Rectangle box = new Rectangle(100, 100, 100, 300);
        g2.fill(box);
        g2.draw(box);

        Ellipse2D.Double red = new Ellipse2D.Double(110, 110, 80, 80);
        g2.setColor(Color.RED);
        g2.fill(red);
        g2.draw(red);

        Ellipse2D.Double yellow = new Ellipse2D.Double(110, 210, 80, 80);
        g2.setColor(Color.YELLOW);
        g2.fill(yellow);
        g2.draw(yellow);

        Ellipse2D.Double green = new Ellipse2D.Double(110, 310, 80, 80);
        g2.setColor(Color.GREEN);
        g2.fill(green);
        g2.draw(green);
    }
}
