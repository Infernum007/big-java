package p_02_10_DrawStrings;

import javax.swing.*;

/**
 * Write a graphics program that draws 12 strings, one each for the 12 standard
 * colors (except {@code Color.WHITE}), each in its own color. Provide a class
 * {@code ColorNameViewer} and a class {@code ColorNameComponent}.
 */
public class ColorNameViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Color Name");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ColorNameComponent text = new ColorNameComponent();

        frame.add(text);

        frame.setVisible(true);
    }
}
