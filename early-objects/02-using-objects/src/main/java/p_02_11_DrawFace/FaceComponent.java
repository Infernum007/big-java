package p_02_11_DrawFace;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * Write a program to plot the face at right. Provide a class {@code FaceViewer}
 * and a class {@code FaceComponent}.
 */
public class FaceComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Ellipse2D.Double face = new Ellipse2D.Double(50, 50, 100, 100);
        g2.draw(face);

        Ellipse2D.Double eye1 = new Ellipse2D.Double(46 + 100 / 3, 46 + 100 / 3, 8, 8);
        g2.draw(eye1);

        Ellipse2D.Double eye2 = new Ellipse2D.Double(146 - 100 / 3, 46 + 100 / 3, 8, 8);
        g2.draw(eye2);

        Line2D.Double mouth = new Line2D.Double(50 + 100 / 3, 150 - 100 / 3, 150 - 100 / 3, 150 - 100 / 3);
        g2.draw(mouth);
    }
}
