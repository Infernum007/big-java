package e_18_06_generic_selection_sort;

import ArrayUtils.ArrayUtil;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * This program demonstrates the selection sort algorithm by
 * sorting an array that is filled with random numbers.
 */
public class SelectionSortDemo
{
    public static void main(String[] args)
    {
        // Integers sorting

        Integer[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(a));

        SelectionSorter.sort(a);

        System.out.println(Arrays.toString(a));

        // String sorting

        String[] strings = {"e", "c", "d", "a", "b"};
        System.out.println(Arrays.toString(strings));

        SelectionSorter.sort(strings);

        System.out.println(Arrays.toString(strings));

        // Local date

        LocalDate[] localDates = {
                LocalDate.of(2017, 4, 5),
                LocalDate.of(2017, 2, 1),
                LocalDate.of(2010, 10, 15),
                LocalDate.of(2016, 1, 8),
                LocalDate.of(207, 9, 29)
        };
        System.out.println(Arrays.toString(localDates));

        SelectionSorter.sort(localDates);

        System.out.println(Arrays.toString(localDates));
    }
}
