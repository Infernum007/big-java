package p_22_02_merge_sort;

import java.util.Arrays;

/**
 * The sort method of this class sorts an array, using the merge
 * sort algorithm.
 */
public class MergeSorter
{
    public static void concurrentMergeSort(final int[] a)
    {
        final int threads = 4;
        concurrentMergeSort(a, threads);
    }

    public static void concurrentMergeSort(final int[] a, final int threadCount)
    {
        if (threadCount <= 1) {
            sort(a);
        } else if (a.length >= 2) {
            int[] first = Arrays.copyOfRange(a, 0, a.length / 2);
            int[] second = Arrays.copyOfRange(a, a.length / 2, a.length);

            Thread leftThread = new Thread(new MergeSorterRunner(first, threadCount / 2));
            Thread rightThread = new Thread(new MergeSorterRunner(second, threadCount / 2));
            leftThread.start();
            rightThread.start();

            try {
                leftThread.join();
                rightThread.join();
            }
            catch (InterruptedException ignored) {
            }

            merge(first, second, a);
        }
    }

    /**
     * Sorts an array, using merge sort.
     *
     * @param a the array to sort
     */
    public static void sort(int[] a)
    {
        if (a.length <= 1) {
            return;
        }
        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];
        System.arraycopy(a, 0, first, 0, first.length);
        System.arraycopy(a, first.length, second, 0, second.length);
        sort(first);
        sort(second);
        merge(first, second, a);
    }

    /**
     * Merges two sorted arrays into an array
     *
     * @param first  the first sorted array
     * @param second the second sorted array
     * @param a      the array into which to merge first and second
     */
    private static void merge(int[] first, int[] second, int[] a)
    {
        int iFirst = 0; // Next element to consider in the first array
        int iSecond = 0; // Next element to consider in the second array
        int j = 0; // Next open position in a

        // As long as neither iFirst nor iSecond is past the end, move
        // the smaller element into a
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }

        // Note that only one of the two loops below copies entries
        // Copy any remaining entries of the first array
        while (iFirst < first.length) {
            a[j] = first[iFirst];
            iFirst++;
            j++;
        }

        // Copy any remaining entries of the second half
        while (iSecond < second.length) {
            a[j] = second[iSecond];
            iSecond++;
            j++;
        }
    }
}
