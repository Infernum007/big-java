package e_02_10_ColorDarker;

import java.awt.*;

/**
 * Repeat Exercise E2.8, but apply the darker method of the Color class twice
 * to the object {@code Color.RED}. Call your class {@code DarkerDemo}.
 */
public class ColorDarker
{
    public static void main(String[] args)
    {
        Color myColor = Color.RED;

        System.out.println("RED: " + myColor);

        myColor = Color.RED.darker();

        System.out.println("Darker: " + myColor);

        myColor = Color.RED.darker().darker();

        System.out.println("Darker: " + myColor);
    }
}
