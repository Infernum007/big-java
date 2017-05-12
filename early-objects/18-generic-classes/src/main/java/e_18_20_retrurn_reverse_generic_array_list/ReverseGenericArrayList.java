package e_18_20_reverse_generic_array_list;

import ArrayUtils.ArrayUtil;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Provide a static method that returns the reverse of a generic array list,
 * without modifying the original list.
 */
public class ReverseGenericArrayList
{
    public static void main(String[] args)
    {
        // Test integers

        ArrayList<Integer> A = ArrayUtil.sequenceOfNumbers(1, 9);
        System.out.println("A original: " + A);
        ArrayList<Integer> aReversed = reverse(A);
        System.out.println("A reversed: " + aReversed + "\n");

        ArrayList<Integer> B = ArrayUtil.sequenceOfNumbers(1, 10);
        System.out.println("B original: " + B);
        ArrayList<Integer> bReversed = reverse(B);
        System.out.println("B reversed: " + bReversed + "\n");

        // Test strings

        ArrayList<String> S = ArrayUtil.sequenceOfStrings('A', 'H');
        System.out.println("S original : " + S);
        ArrayList<String> sReversed =  reverse(S);
        System.out.println("S reversed : " + sReversed + "\n");

        // Test zero length

        ArrayList<Integer> X = new ArrayList<>();
        System.out.println("X original : " + X);
        ArrayList<Integer> xReversed = reverse(X);
        System.out.println("X reversed : " + xReversed);
    }

    /**
     * Reverses generic array list in-place by swapping its elements.
     *
     * @param a   generic array
     * @param <E> type of elements to swap
     */
    public static <E> ArrayList<E> reverse(ArrayList<E> a)
    {
        Objects.requireNonNull(a, "Array is null");
        int length = a.size();
        if (length == 0) { return a; }

        ArrayList<E> result = new ArrayList<>(length);
        for (int i = length - 1; i >= 0; i--)
        {
            result.add(a.get(i));
        }
        return result;
    }
}
