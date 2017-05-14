package p_18_06_generic_predicate_filter;

import ArrayUtils.ArrayUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Using the {@code java.util.function.Predicate} interface,
 * write a static generic method
 * <blockquote>
 * {@code List<T> filter(List<T> values, Predicate<? super T> p)}
 * </blockquote>
 * that returns a list of all values for which the predicate returns true.
 * Demonstrate how to use this method by getting a list of all strings with
 * length greater than ten from a given list of strings. Use a lambda
 * expression (see Java 8 Note 10.4).
 */
public class PredicateFilterDemo
{
    public static void main(String[] args) throws IOException
    {
        // Test integers

        List<Integer> integers = ArrayUtil.randomSequenceOfNumbers(10, 20);
        System.out.println("Before: " + integers);

        List<Integer> integersResult = filter(integers, i -> i > 10);
        System.out.println("After:  " + integersResult);
    }

    /**
     * Returns a list of all values for which the predicate returns true.
     *
     * @param values the list of values to test
     * @param p      the predicate
     * @param <T>    the type of elements of the list
     * @return list of all values for which the predicate returns true
     */
    public static <T> List<T> filter(List<T> values, Predicate<? super T> p)
    {
        List<T> result = new ArrayList<>();

        for (T el : values)
        {
            if (p.test(el)) { result.add(el); }
        }
        return result;
    }
}
