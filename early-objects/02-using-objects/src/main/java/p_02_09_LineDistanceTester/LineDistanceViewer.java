package p_02_09_LineDistanceTester;

import javax.swing.*;

/**
 * Description
 */
public class LineDistanceViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(500, 400);
        frame.setTitle("Line Distance");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LineDistanceComponent lineComponent = new LineDistanceComponent();

        frame.add(lineComponent);

        frame.setVisible(true);
    }
}
