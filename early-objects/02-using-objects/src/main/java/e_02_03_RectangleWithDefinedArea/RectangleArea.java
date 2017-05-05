package e_02_03_RectangleWithDefinedArea;

import java.awt.*;

/**
 * Write a program that constructs a rectangle with area 42 and a rectangle
 * with perimeter 42. Print the widths and heights of both rectangles.
 */
public class RectangleArea
{
    public static void main(String[] args)
    {
        // Area
        Rectangle rectangleArea = new Rectangle(6, 7);

        double area = rectangleArea.getWidth() * rectangleArea.getHeight();
        System.out.print("Rectangle area: ");
        System.out.println(area);

        System.out.print("Rectangle width: ");
        System.out.println(rectangleArea.getWidth());

        System.out.print("Rectangle height: ");
        System.out.println(rectangleArea.getHeight());
        System.out.println();

        // Perimeter
        Rectangle rectanglePerimeter = new Rectangle(10, 11);

        double perimeter = rectanglePerimeter.getWidth() * 2
                + rectanglePerimeter.getHeight() * 2;
        System.out.print("Rectangle perimeter: ");
        System.out.println(perimeter);

        System.out.print("Rectangle width: ");
        System.out.println(rectanglePerimeter.getWidth());

        System.out.print("Rectangle height: ");
        System.out.println(rectanglePerimeter.getHeight());
    }
}
