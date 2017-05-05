package e_02_19_DrawNameRed;

import javax.swing.*;

/**
 * Write a graphics program that draws your name in red, contained inside a
 * blue rectangle. Provide a class {@code NameViewer} and a class
 * {@code NameComponent}.
 */
public class NameViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Name in red");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NameComponent text = new NameComponent();

        frame.add(text);

        frame.setVisible(true);
    }
}
