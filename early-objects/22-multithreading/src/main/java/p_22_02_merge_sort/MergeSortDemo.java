package p_22_02_merge_sort;

import java.util.Arrays;

/**
 * This program demonstrates the merge sort algorithm by
 * sorting an array that is filled with random numbers.
 */
public class MergeSortDemo
{
    public static void main(String[] args) throws InterruptedException
    {
//        int[] a = ArrayUtil.randomIntArray(20, 100);
//        System.out.println(Arrays.toString(a));
//
//        MergeSorter.concurrentMergeSort(a);
//
//        System.out.println(Arrays.toString(a));
//        System.out.println("Sorted: " + ArrayUtil.isSorted(a));

        int LENGTH = 1000;   // initial length of array to sort
        int RUNS   =  16;   // how many times to grow by 2?

        for (int i = 1; i <= RUNS; i++) {
            int[] a = ArrayUtil.randomIntArray(LENGTH, 1000);

            // run the algorithm and time how long it takes
            long startTime1 = System.currentTimeMillis();
            MergeSorter.concurrentMergeSort(a);
            long endTime1 = System.currentTimeMillis();

            if (!ArrayUtil.isSorted(a)) {
                throw new RuntimeException("not sorted afterward: " + Arrays.toString(a));
            }

            System.out.printf("%10d elements  =>  %6d ms \n", LENGTH, endTime1 - startTime1);
            LENGTH *= 2;   // double size of array for next time
        }
    }
}
