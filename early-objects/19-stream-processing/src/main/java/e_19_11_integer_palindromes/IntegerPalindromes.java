package e_19_11_integer_palindromes;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Write a program that reads an integer <em>n</em> and then prints all squares
 * of the integers from 1 to <em>n</em> that are palindromes (that is, their
 * decimal representation equals its reverse). Use {@code IntStream.range},
 * {@code map}, and {@code filter}.
 */
public class IntegerPalindromes
{
    public static void main(String[] args)
    {
        int n = getUserInput("Please enter an integer: ");

        try (IntStream intStream = IntStream.range(1, n)) {
            intStream.map(x -> x * x)
                    .filter(IntegerPalindromes::isPalindrome)
                    .forEach(System.out::println);
        }
    }

    public static boolean isPalindrome(final long integer)
    {
        String intStr = String.valueOf(integer);
        return intStr.equals(new StringBuilder(intStr).reverse().toString());
    }

    /**
     * Prompts user for input and returns it as an int.
     *
     * @param prompt user prompt
     * @return user input
     */
    public static int getUserInput(final String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextInt();
    }
}
