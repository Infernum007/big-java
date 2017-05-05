package e_02_17_TwoSquares;

import javax.swing.*;

/**
 * Write a graphics program that draws two squares, both with the same center.
 * Provide a class {@code TwoSquareViewer} and a class {@code TwoSquareComponent}.
 */
public class TwoSquareViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Two squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TwoSquareComponent squareComponent = new TwoSquareComponent();
        frame.add(squareComponent);

        frame.setVisible(true);
    }
}
