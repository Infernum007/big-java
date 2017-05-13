package p_18_01_pair_min_max_measurable;

/**
 * {@code PairUtil} class contains utility methods for the {@code Pair} class.
 */
public class PairUtil
{
    /**
     * Gets the minimum and maximum of an array of objects of type {@code T}.
     *
     * @param a an array of objects of type {@code T}
     * @return a pair with the min and max value, or null if a is null or empty
     */
    public static <T extends Measurable> Pair<T> minmax(T[] a)
    {
        if (a == null || a.length == 0) { return null; }

        T min = a[0];
        T max = a[0];

        for (T elem : a)
        {
            if (min.getMeasure() > elem.getMeasure()) { min = elem; }
            if (max.getMeasure() < elem.getMeasure()) { max = elem; }
        }
        return new Pair<>(min, max);
    }
}

