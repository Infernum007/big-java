package e_18_14_generic_measurer_interface;

import java.awt.*;

/**
 * Objects of this class measure rectangles by area.
 */
public class AreaMeasurer implements Measurer<Rectangle>
{
    @Override
    public double measure(Rectangle anObject)
    {
        return anObject.getWidth() * anObject.getHeight();
    }
}
