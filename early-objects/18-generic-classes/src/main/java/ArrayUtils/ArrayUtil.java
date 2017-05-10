package ArrayUtils;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil
{
    private static Random generator = new Random();

    /**
     * Creates an array filled with random values.
     *
     * @param length the length of an array
     * @param n      the number of possible random values
     * @return an array filled with length numbers between 0 and n - 1
     */
    public static Integer[] randomIntArray(int length, int n)
    {
        Integer[] a = new Integer[length];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = generator.nextInt(n);
        }
        return a;
    }

    /**
     * Swaps two entries of an array.
     *
     * @param a the array
     * @param i the first position to swap
     * @param j the second position to swap
     */
    public static <T> void swap(T[] a, int i, int j)
    {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * Gets the ordered sequence of integers.
     *
     * @param start the first number in the list
     * @param end the last number in the list
     * @return ordered array list of integers
     */
    public static ArrayList<Integer> sequenceOfNumbers(int start, int end)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i++)
        {
            result.add(i);
        }
        return result;
    }

    public static ArrayList<String> sequenceOfStrings(char start, char end)
    {
        ArrayList<String> result = new ArrayList<>();
        for (char i = start; i < end; i++)
        {
            String s = String.valueOf(i);
            result.add(s);
        }
        return result;
    }
}
