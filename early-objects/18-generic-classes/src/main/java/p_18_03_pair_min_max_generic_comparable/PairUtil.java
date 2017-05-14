package p_18_03_pair_min_max_generic_comparable;

/**
 * {@code PairUtil} class contains utility methods for the {@code Pair} class.
 */
public class PairUtil
{
    /**
     * Gets the minimum and maximum of an array of comparable objects of type {@code T}.
     *
     * @param a an array of objects of type {@code T}
     * @return a pair with the min and max value, or null if a is null or empty
     */
    public static <T extends Comparable<? super T>> Pair<T> minmax(T[] a)
    {
        if (a == null || a.length == 0) { return null; }

        T min = a[0];
        T max = a[0];

        for (T elem : a)
        {
            if (min.compareTo(elem) > 0 ) { min = elem; }
            if (max.compareTo(elem) < 0) { max = elem; }
        }
        return new Pair<>(min, max);
    }
}

