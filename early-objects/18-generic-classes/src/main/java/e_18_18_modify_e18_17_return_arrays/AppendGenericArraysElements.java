package e_18_18_modify_e18_17_return_arrays;

import java.util.Arrays;

/**
 * Modify the method of Exercise E18.17 so that it receives and
 * returns arrays, not array lists. Hint: {@code Arrays.copyOf}.
 */
public class AppendGenericArraysElements
{
    public static void main(String[] args)
    {
        // Test strings

        String[] a = new String[2];
        a[0] = "Tony";
        a[1] = "Carl";

        String[] b = new String[4];
        b[0] = "Carl";
        b[1] = "Harry";
        b[2] = "Tony";
        b[3] = "Tony";

        String[] strings = append(a, b);

        System.out.println(Arrays.toString(strings));
        System.out.println("Length: " + strings.length);

        // Test integers

        Integer[] m = new Integer[2];
        m[0] = 1;
        m[1] = 2;

        Integer[] n = new Integer[4];
        n[0] = 3;
        n[1] = 3;
        n[2] = 4;
        n[3] = 5;

        Integer[] integers = append(m, n);

        System.out.println(Arrays.toString(integers));
        System.out.println("Size: " + integers.length);
    }

    /**
     * Appends elements of array b to the array a.
     *
     * @param a generic array
     * @param b generic array
     * @param <T> type of the array
     * @return new array with elements of array b appended to array a
     */
    public static <T> T[] append(T[] a, T[] b)
    {
        T[] result = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, result, a.length, result.length - a.length);
        return result;
    }
}
