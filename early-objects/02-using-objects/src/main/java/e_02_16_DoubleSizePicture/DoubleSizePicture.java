package e_02_16_DoubleSizePicture;

import java.awt.*;

/**
 * Using the {@code Picture} class of Worked Example 2.2, write
 * a {@code DoubleSizePicture} program that loads a picture, doubles
 * its size, and shows the center of the picture in the window.
 */
public class DoubleSizePicture
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load(System.getProperty("user.dir") +
                "/src/early-objects/02-using-objects/E_02_15_HalfSizePicture/queen-mary.png");

        int newWidth = pic.getWidth() * 2;
        int newHeight = pic.getHeight() * 2;

        pic.scale(newWidth, newHeight);

        int iStart = pic.getWidth() / 2 - 3;
        int jStart = pic.getHeight() / 2 - 3;

        for (int i = iStart; i < pic.getWidth() / 2 + 3; i++)
        {
            for (int j = jStart; j < pic.getHeight() / 2 + 3; j++)
            {
                pic.setColorAt(i, j, Color.magenta);
            }
        }
    }
}
