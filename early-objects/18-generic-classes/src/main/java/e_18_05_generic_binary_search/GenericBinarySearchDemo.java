package e_18_05_generic_binary_search;

import ArrayUtils.ArrayUtil;

import java.util.Arrays;

/**
 * Implement a generic version of the binary search algorithm.
 */
public class GenericBinarySearchDemo
{
    public static void main(String[] args)
    {
        // Integer

        Integer[] integers = ArrayUtil.randomIntArray(10, 10);

        Arrays.sort(integers);

        System.out.println(Arrays.toString(integers));

        int result = BinarySearcher.search(integers, 0, integers.length - 1, 9);
        System.out.println(result);

        // String

        String[] strings = {"a", "b", "c", "d", "e", "f", "g", "h"};

        int res = BinarySearcher.search(strings, 0, strings.length - 1, "r");

        System.out.println(Arrays.toString(strings));

        System.out.println(res);
    }
}
