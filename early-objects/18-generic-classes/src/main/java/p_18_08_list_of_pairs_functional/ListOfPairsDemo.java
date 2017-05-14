package p_18_08_list_of_pairs_functional;

import ArrayUtils.ArrayUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Write a static generic method
 * <blockquote>
 * {@code List<Pair<T, R>> map(List<T> values, Function<T, R> f)}
 * </blockquote>
 * that returns a list of pairs {@code (v, f.apply(v))},
 * where {@code v} ranges over the given values.
 */
public class ListOfPairsDemo
{
    public static void main(String[] args)
    {
        List<Integer> integers = ArrayUtil.randomSequenceOfNumbers(10, 2000);

        // converts integer to binary string representation
        Function<Integer, String> function = Integer::toBinaryString;

        List<Pair<Integer, String>> integerToBinary = map(integers, function);

        System.out.println("Decimal to binary map:");
        integerToBinary.forEach(n -> System.out.format("%4s = %s%n", n.getFirst(), n.getSecond()));
    }

    /**
     * Gets a list of pairs {@code (v, f.apply(v))}, where {@code v}
     * ranges over the given values.
     *
     * @param values list of elements
     * @param f function to apply to each element in the list
     * @param <T> type of element to receive on input
     * @param <R> type of element to receive on output
     * @return a list of pairs {@code (v, f.apply(v))}
     */
    public static <T, R> List<Pair<T, R>> map(List<T> values, Function<T, R> f)
    {
        List<Pair<T, R>> result = new ArrayList<>();

        for (T v : values)
        {
            result.add(new Pair<>(v, f.apply(v)));
        }

        // same as foreach loop
        // values.forEach(v -> result.add(new Pair<>(v , f.apply(v))));

        return result;
    }
}
