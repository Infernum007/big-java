package e_18_14_generic_measurer_interface;

import java.awt.*;

/**
 * Objects of this class measure rectangles by area.
 */
public class AreaMeasurer<T> implements Measurer<T>
{
    @Override
    public double measure(T anObject)
    {
        Rectangle rectangle = (Rectangle) anObject;
        return rectangle.getWidth() * rectangle.getHeight();
    }
}
