package p_02_10_DrawStrings;

import javax.swing.*;
import java.awt.*;

/**
 * Write a graphics program that draws 12 strings, one each for the 12 standard
 * colors (except {@code Color.WHITE}), each in its own color. Provide a class
 * {@code ColorNameViewer} and a class {@code ColorNameComponent}.
 */
public class ColorNameComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.MAGENTA);
        g2.drawString("Color.MAGENTA", 50, 50);

        g2.setColor(Color.PINK);
        g2.drawString("Color.PINK", 50, 75);

        g2.setColor(Color.RED);
        g2.drawString("Color.RED", 50, 100);

        g2.setColor(Color.ORANGE);
        g2.drawString("Color.ORANGE", 50, 125);

        g2.setColor(Color.YELLOW);
        g2.drawString("Color.YELLOW", 50, 150);

        g2.setColor(Color.GREEN);
        g2.drawString("Color.GREEN", 50, 175);

        g2.setColor(Color.CYAN);
        g2.drawString("Color.CYAN", 50, 200);

        g2.setColor(Color.BLUE);
        g2.drawString("Color.BLUE", 50, 225);

        g2.setColor(Color.LIGHT_GRAY);
        g2.drawString("Color.LIGHT_GRAY", 50, 250);

        g2.setColor(Color.GRAY);
        g2.drawString("Color.GRAY", 50, 275);

        g2.setColor(Color.DARK_GRAY);
        g2.drawString("Color.DARK_GRAY", 50, 300);

        g2.setColor(Color.BLACK);
        g2.drawString("Color.BLACK", 50, 325);


    }
}
