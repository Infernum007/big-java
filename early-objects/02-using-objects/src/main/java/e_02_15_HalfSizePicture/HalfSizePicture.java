package e_02_15_HalfSizePicture;

/**
 * Using the {@code Picture} class of Worked Example 2.2, write
 * a {@code HalfSizePicture} program that loads a picture and
 * shows it at half the original size, centered in the window.
 */
public class HalfSizePicture
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load(System.getProperty("user.dir") +
                "/src/early-objects/02-using-objects/E_02_15_HalfSizePicture/queen-mary.png");

        int newWidth = pic.getWidth() / 2;
        int newHeight = pic.getHeight() / 2;

        pic.scale(newWidth, newHeight);

        pic.move(newWidth / 2, newHeight / 2);
    }
}
