package p_02_04_TranslateRectangle;

import javax.swing.*;
import java.awt.*;

/**
 * In this exercise, you will explore a simple way of visualizing a {@code
 * Rectangle} object. The {@code setBounds} method of the {@code JFrame}
 * class moves a frame window to a given rectangle. Complete the following
 * program to visually show the translate method of the {@code Rectangle} class:
 * <p><pre>
 *      import java.awt.Rectangle;
 *      import javax.swing.JFrame;
 *      import javax.swing.JOptionPane;
 *      public class TranslateDemo
 *      {
 *          public static void main(String[] args)
 *          {
 *              // Construct a frame and show it
 *              JFrame frame = new JFrame();
 *              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 *              frame.setVisible(true);
 *
 *              // Your work goes here:
 *              // Construct a rectangle and set the frame bounds
 *
 *              JOptionPane.showMessageDialog(frame, "Click OK to continue");
 *
 *              // Your work goes here:
 *              // Move the rectangle and set the frame bounds again
 *          }
 *      }</pre>
 */
public class TranslateDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Rectangle box = new Rectangle(0, 0, 500, 500);
        frame.setBounds(box);

        JOptionPane.showMessageDialog(frame, "Click OK to continue");

        box.translate(500, 0);
        frame.setBounds(box);
    }
}
