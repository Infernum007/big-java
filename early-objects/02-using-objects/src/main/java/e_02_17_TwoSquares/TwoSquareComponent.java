package e_02_17_TwoSquares;

import javax.swing.*;
import java.awt.*;

/**
 * Write a graphics program that draws two squares, both with the same center.
 * Provide a class {@code TwoSquareViewer} and a class {@code TwoSquareComponent}.
 */
public class TwoSquareComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle square1 = new Rectangle(70, 70, 100, 100);
        g2.draw(square1);

        Rectangle square2 = new Rectangle(20, 20, 200, 200);
        g2.draw(square2);
    }

}
