package e_18_22_check_if_generic_list_in_increasing_order;

import ArrayUtils.ArrayUtil;
import e_18_19_void_reverse_generic_array_list.GenericReverseArrayList;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Provide a static method that checks whether the elements of a generic array
 * list are in increasing order. The elements must be comparable.
 */
public class IncreasingOrderTest
{
    public static void main(String[] args)
    {
        // Test integers

        ArrayList<Integer> increasingSeq = ArrayUtil.sequenceOfNumbers(0, 10);
        System.out.println("Array List:       " + increasingSeq);
        System.out.println("Increasing order: " + inIncreasingOrder(increasingSeq) + "\n");

        // Reverse previous array
        GenericReverseArrayList.reverse(increasingSeq);
        System.out.println("Array List:       " + increasingSeq);
        System.out.println("Increasing order: " + inIncreasingOrder(increasingSeq) + "\n");

        ArrayList<Integer> randomSeq = ArrayUtil.randomSequenceOfNumbers(10, 20);
        System.out.println("Array List:       " + randomSeq);
        System.out.println("Increasing order: " + inIncreasingOrder(randomSeq) + "\n");

        // Test strings

        ArrayList<String> strOrderedSeq = ArrayUtil.sequenceOfStrings('A', 'H');
        System.out.println("Array List:       " + strOrderedSeq);
        System.out.println("Increasing order: " + inIncreasingOrder(strOrderedSeq) + "\n");

        // Reverse previous array
        GenericReverseArrayList.reverse(strOrderedSeq);
        System.out.println("Array List:       " + strOrderedSeq);
        System.out.println("Increasing order: " + inIncreasingOrder(strOrderedSeq) + "\n");

        ArrayList<String> strUnorderedSeq = ArrayUtil.randomSequenceOfStrings('A', 'H');
        System.out.println("Array List:       " + strUnorderedSeq);
        System.out.println("Increasing order: " + inIncreasingOrder(strUnorderedSeq) + "\n");
    }

    /**
     * Checks whether the elements of the array list are in increasing order.
     *
     * @param A   generic array list
     * @param <E> type of the elements of the list
     * @return true if elements of the array are in increasing order
     */
    public static <E extends Comparable<E>> boolean inIncreasingOrder(ArrayList<E> A)
    {
        Objects.requireNonNull(A, "Array is null");

        int length = A.size();
        if (length == 0) { return false; }

        for (int i = 0; i < length - 1; i++)
        {
            if (A.get(i).compareTo(A.get(i + 1)) > 0) { return false; }
        }
        return true;
    }
}
