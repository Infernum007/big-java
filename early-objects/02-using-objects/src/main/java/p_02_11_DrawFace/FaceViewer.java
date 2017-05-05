package p_02_11_DrawFace;

import javax.swing.*;

/**
 * Description
 */
public class FaceViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Face");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        FaceComponent face = new FaceComponent();

        frame.add(face);

        frame.setVisible(true);
    }
}
