package e_02_12_RandomPrice;

import java.util.Random;

/**
 * Write a program {@code RandomPrice} that prints a random price between
 * $10.00 and $19.95 every time the program is run.
 */
public class RandomPrice
{
    public static void main(String[] args)
    {
        Random generator = new Random();

        System.out.println((double) (generator.nextInt(995) + 1001) / 100.0);
    }
}
