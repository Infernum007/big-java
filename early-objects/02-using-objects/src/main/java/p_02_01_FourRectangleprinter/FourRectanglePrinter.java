package p_02_01_FourRectangleprinter;

import java.awt.*;

/**
 * Write a program called {@code FourRectanglePrinter} that constructs
 * a {@code Rectangle} object, prints its location by calling
 * {@code System.out.println(box)}, and then translates and prints it
 * three more times, so that, if the rectangles were drawn, they would
 * form one large rectangle, as shown at right. Your program will not
 * produce a drawing. It will simply print the locations of the four rectangles.
 */
public class FourRectanglePrinter
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(0, 0, 100, 300);
        System.out.println(box);

        box.translate(100, 0);
        System.out.println(box);

        box.translate(-100, 300);
        System.out.println(box);

        box.translate(100, 0);
        System.out.println(box);
    }
}
