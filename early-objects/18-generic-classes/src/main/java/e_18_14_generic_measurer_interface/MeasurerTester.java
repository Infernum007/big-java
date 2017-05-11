package e_18_14_generic_measurer_interface;

import java.awt.*;

/**
 * Make the {@code Measurer} interface from Chapter 10 into a generic class.
 * Provide a static method {@code T max(T[] values, Measurer<T> meas)}.
 */
public class MeasurerTester
{
    public static void main(String[] args)
    {
        // Measure rectangles

        Rectangle[] rects = new Rectangle[]{
                new Rectangle(5, 10, 20, 30),
                new Rectangle(10, 20, 30, 40),
                new Rectangle(20, 30, 5, 15)
        };

        Measurer<Rectangle> areaMeas = new AreaMeasurer();

        // Measure the average area of the objects
        double averageArea = Data.average(rects, areaMeas);
        System.out.println("Average area: " + averageArea);
        System.out.println("Expected: 625");

        // Measure rectangle with maximum area
        Rectangle maxArea = Data.max(rects, areaMeas);
        System.out.println("Max area: " + maxArea);
        System.out.println("Expected: " + rects[1]);

        // Measure bank accounts

        BankAccount[] accounts = new BankAccount[]{
                new BankAccount(10.0),
                new BankAccount(20.33),
                new BankAccount(15.50),
                new BankAccount(0.33),
                new BankAccount(40.7)
        };

        // Measure total average value of bank accounts
        Measurer<BankAccount> accountMeas = new BankAccountBalanceMeasurer();
        double avarageAccountValue = Data.average(accounts, accountMeas);
        System.out.println("Average account value: " + avarageAccountValue);
        System.out.println("Expected average account value: 17.372");

        // Measure Bank account with maximum balance
        BankAccount maxAccount = Data.max(accounts, accountMeas);
        System.out.println("Max account value: " + maxAccount.getBalance());
        System.out.println("Expected max account value: 40.7");
    }
}
