package p_02_05_LotteryPrinter;

import java.util.Random;

/**
 * Write a program {@code LotteryPrinter} that picks a combination in a lottery.
 * In this lottery, players can choose 6 numbers (possibly repeated) between
 * 1 and 49. Construct an object of the {@code Random} class and invoke an
 * appropriate method to generate each number. (In a real lottery, repetitions
 * are not allowed, but we haven’t yet discussed the programming constructs that
 * would be required to deal with that problem.) Your program should print out a
 * sentence such as "Play this combination — it'll make you rich!", followed
 * by a lottery combination.
 */
public class LotteryPrinter
{
    public static void main(String[] args)
    {
        Random random = new Random();

        System.out.println("Play this combination — it'll make you rich!");
        System.out.print(random.nextInt(49) + 1 + " ");
        System.out.print(random.nextInt(49) + 1 + " ");
        System.out.print(random.nextInt(49) + 1 + " ");
        System.out.print(random.nextInt(49) + 1 + " ");
        System.out.print(random.nextInt(49) + 1 + " ");
        System.out.print(random.nextInt(49) + 1);
    }
}
