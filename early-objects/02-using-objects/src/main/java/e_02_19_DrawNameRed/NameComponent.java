package e_02_19_DrawNameRed;

import javax.swing.*;
import java.awt.*;

/**
 * Write a graphics program that draws your name in red, contained inside a
 * blue rectangle. Provide a class {@code NameViewer} and a class
 * {@code NameComponent}.
 */
public class NameComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        Rectangle rectangle = new Rectangle(50, 50, 200, 100);
        g2.setColor(Color.BLUE);
        g2.draw(rectangle);
        g2.fill(rectangle);

        g2.setColor(Color.RED);
        g2.drawString("Carl Cracker", 100, 100);
    }

}
