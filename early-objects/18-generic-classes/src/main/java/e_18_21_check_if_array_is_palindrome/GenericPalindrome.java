package e_18_21_check_if_array_is_palindrome;

import ArrayUtils.ArrayUtil;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Provide a static method that checks whether a generic array list is a
 * palindrome; that is, whether the values at index {@code i} and
 * {@code n - 1 - i} are equal to each other, where {@code n} is the
 * size of the array list.
 */
public class GenericPalindrome
{
    public static void main(String[] args)
    {
        // Test non-palindrome

        ArrayList<Integer> oddSeq = ArrayUtil.sequenceOfNumbers(0, 10);
        System.out.println("Sorted array: " + oddSeq);
        System.out.println("isPalindrome: " + isPalindrome(oddSeq) + "\n");

        ArrayList<Integer> evenSeq = ArrayUtil.sequenceOfNumbers(0, 9);
        System.out.println("Sorted array: " + evenSeq);
        System.out.println("isPalindrome: " + isPalindrome(evenSeq) + "\n");

        ArrayList<String> strSeq = ArrayUtil.sequenceOfStrings('A', 'H');
        System.out.println("Sorted array: " + strSeq);
        System.out.println("isPalindrome: " + isPalindrome(strSeq) + "\n");

        // Test palindrome

        ArrayList<Integer> oddPalindrome = new ArrayList<>();
        oddPalindrome.add(0);
        oddPalindrome.add(1);
        oddPalindrome.add(2);
        oddPalindrome.add(3);
        oddPalindrome.add(4);
        oddPalindrome.add(3);
        oddPalindrome.add(2);
        oddPalindrome.add(1);
        oddPalindrome.add(0);
        System.out.println("Palindrome array: " + oddPalindrome);
        System.out.println("isPalindrome:     " + isPalindrome(oddPalindrome) + "\n");

        ArrayList<Integer> evenPalindrome = new ArrayList<>();
        evenPalindrome.add(0);
        evenPalindrome.add(1);
        evenPalindrome.add(2);
        evenPalindrome.add(3);
        evenPalindrome.add(3);
        evenPalindrome.add(2);
        evenPalindrome.add(1);
        evenPalindrome.add(0);
        System.out.println("Palindrome array: " + evenPalindrome);
        System.out.println("isPalindrome:     " + isPalindrome(evenPalindrome) + "\n");

        ArrayList<String> strPalindrome = new ArrayList<>();
        strPalindrome.add("A");
        strPalindrome.add("B");
        strPalindrome.add("C");
        strPalindrome.add("D");
        strPalindrome.add("E");
        strPalindrome.add("D");
        strPalindrome.add("C");
        strPalindrome.add("B");
        strPalindrome.add("A");
        System.out.println("Palindrome array: " + strPalindrome);
        System.out.println("isPalindrome:     " + isPalindrome(strPalindrome) + "\n");

    }

    /**
     * Checks whether generic array list is palindrome.
     *
     * @param A generic array list
     * @param <E> type of the element of generic array list
     * @return true if array list is a palindrome, false otherwise
     */
    public static <E> boolean isPalindrome(ArrayList<E> A)
    {
        Objects.requireNonNull(A, "Array is null");

        int n = A.size();
        if (n == 0) { return true; }

        for (int i = 0; i < n; i++)
        {
            if (A.get(i) != A.get(n - 1 - i)) { return false; }
        }
        return true;
    }
}
