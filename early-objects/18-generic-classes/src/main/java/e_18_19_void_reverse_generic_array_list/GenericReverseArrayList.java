package e_18_19_void_reverse_generic_array_list;

import ArrayUtils.ArrayUtil;

import java.util.ArrayList;

/**
 * Provide a static method that reverses the elements of a generic array list.
 */
public class GenericReverseArrayList
{
    public static void main(String[] args)
    {
        // Test integers

        ArrayList<Integer> A = ArrayUtil.sequenceOfNumbers(1, 9);
        System.out.println("A: " + A);
        reverse(A);
        System.out.println("A: " + A);
        System.out.println();

        ArrayList<Integer> B = ArrayUtil.sequenceOfNumbers(1, 10);
        System.out.println("B: " + B);
        reverse(B);
        System.out.println("B: " + B);
        System.out.println();

        // Test strings

        ArrayList<String> S = ArrayUtil.sequenceOfStrings('A', 'H');
        System.out.println("S: " + S);
        reverse(S);
        System.out.println("S: " + S);
    }

    /**
     * Reverses generic array list in-place by swapping its elements.
     *
     * @param a   generic array
     * @param <E> type of elements to swap
     */
    public static <E> void reverse(ArrayList<E> a)
    {
        if (a == null || a.size() == 0) { return; }

        int i = 0;
        int j = a.size() - 1;
        while (i < a.size() / 2)
        {
            E temp = a.get(i);
            a.set(i, a.get(j));
            a.set(j, temp);
            i++;
            j--;
        }
    }
}
