package e_18_14_generic_measurer_interface;

import java.awt.*;

/**
 * Objects of this class measure rectangles by area.
 */
public class AreaMeasurer<T extends Rectangle> implements Measurer<T>
{
    @Override
    public double measure(T anObject)
    {
        return anObject.getWidth() * anObject.getHeight();
    }
}
