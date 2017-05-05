package bigJavaEarlyObjects_02_UsingObjects.P_02_13_ModifyProgram;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Run the following program:
 * <p><pre>
 *      import java.awt.Color;
 *      import javax.swing.JFrame;
 *      import javax.swing.JLabel;
 *
 *      public class FrameViewer
 *      {
 *          public static void main(String[] args)
 *          {
 *              JFrame frame = new JFrame();
 *              frame.setSize(200, 200);
 *              JLabel label = new JLabel("Hello, World!");
 *              label.setOpaque(true);
 *              label.setBackground(Color.PINK);
 *              frame.add(label);
 *              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 *              frame.setVisible(true);
 *          }
 *      }</pre>
 * Modify the program as follows:
 * <ul><li>Double the frame size.
 * <li>Change the greeting to "Hello, your name!".
 * <li>Change the background color to pale green (see Exercise E2.9).
 * <li>For extra credit, add an image of yourself. (Hint: Construct an
 * {@code ImageIcon}.)</ul>
 */
public class FrameViewer
{
    public static void main(String[] args) throws MalformedURLException
    {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        URL imageURL = new URL("https://www.codester" +
                ".com/static/uploads/categories/50/icon.png");

        JLabel label = new JLabel("Hello, James Gosling!");

        label.setIcon(new ImageIcon(imageURL));

        label.setOpaque(true);

        label.setBackground(Color.PINK);

        frame.add(label);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
