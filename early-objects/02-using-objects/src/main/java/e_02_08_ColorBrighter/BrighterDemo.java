package e_02_08_ColorBrighter;

import java.awt.*;

/**
 * In the Java library, a color is specified by its red, green, and blue
 * components between 0 and 255 (see Table 4 on page 68). Write a program
 * {@code BrighterDemo} that constructs a {@code Color} object with red, green,
 * and blue values of 50, 100, and 150. Then apply the {@code brighter} method
 * of the {@code Color} class and print the red, green, and blue values of the
 * resulting color. (You won’t actually see the color — see Exercise E2.9
 * on how to display the color.)
 */
public class BrighterDemo
{
    public static void main(String[] args)
    {
        Color color = new Color(50, 100, 150);

        color = color.brighter();

        System.out.println(color);
    }
}
