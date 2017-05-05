package e_18_05_generic_binary_search;

/**
 * A class for executing binary searches in an array.
 */
public class BinarySearcher
{
    /**
     * Finds a value in a range of a sorted array,
     * using the binary search algorithm.
     *
     * @param a     the array in which to search
     * @param low   the low index of the range
     * @param high  the high index of the range
     * @param value the value to find
     * @return the index at which the value occurs, or -1
     * if it does occur in the array
     */
    public static <T extends Comparable<T>> int search(T[] a, int low, int high, T value)
    {
        if (low <= high)
        {
            int mid = (low + high) / 2;

            if (a[mid].compareTo(value) == 0)
            {
                return mid;
            }
            else if (a[mid].compareTo(value) < 0)
            {
                return search(a, mid + 1, high, value);
            }
            else
            {
                return search(a, low, mid - 1, value);
            }
        }
        else
        {
            return -1;
        }
    }
}
