package e_02_18_TwoSolidSquares;

import javax.swing.*;
import java.awt.*;

/**
 * Write a program that draws two solid squares: one in pink and one in
 * purple. Use a standard color for one of them and a custom color for the
 * other. Provide a class {@code TwoSquareViewer} and a class
 * {@code TwoSquareComponent}.
 */
public class TwoSquareComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle square1 = new Rectangle(100, 100, 100, 150);
        g2.setColor(Color.PINK);
        g2.draw(square1);
        g2.fill(square1);

        Rectangle square2 = new Rectangle(20, 20, 50, 200);
        g2.setColor(new Color(136, 9, 84));
        g2.draw(square2);
        g2.fill(square2);
    }

}
