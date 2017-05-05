package e_02_04_RectangleAPI;

import java.awt.*;

/**
 * Look into the API documentation of the {@code Rectangle} class and locate
 * the method
 * <p><pre>
 *      {@code void add(int newx, int newy)}</pre>
 * Read through the method documentation. Then determine the result of the
 * following statements:
 * <p><pre>
 *      {@code Rectangle box = new Rectangle(5, 10, 20, 30);
 *      box.add(0, 0);}</pre>
 * Write a program {@code AddTester} that prints the expected and actual
 * location, width, and height of {@code box} after the call to {@code add}.
 */
public class AddTester
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(5, 10, 20, 30);
        rectangle.add(0, 0);

        System.out.println(rectangle);
        System.out.println("Expected: 0, 0, 25, 40");
    }
}
