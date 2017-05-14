package p_18_07_generic_map_with_function;

import ArrayUtils.ArrayUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Write a static generic method
 * <blockquote>
 * {@code List<R> map(List<T> values, Function<T, R> f)}
 * </blockquote>
 * that returns a list of the values returned by the function
 * when called with arguments in the values list.
 */
public class MapDemo
{
    public static void main(String[] args)
    {
        List<Integer> integerList = ArrayUtil.randomSequenceOfNumbers(10, 1100);
        System.out.println("Random integers: " + integerList);

        // Receives integer as input and converts it to hex value
        Function<Integer, String> function = Integer::toHexString;

        List<String> intsToHex = map(integerList, function);

        System.out.print("Converted to Hex values: ");
        intsToHex.forEach(n -> System.out.print(n.toUpperCase() + " "));
    }

    /**
     * Generic method that returns a list of the values returned by the
     * function when called with arguments in the values list.
     *
     * @param values the list of elements of type {@code T}
     * @param f      function to apply for each element in the list
     * @param <T>    type of list elements to receive as input
     * @param <R>    type of list elements to receive as output
     * @return list of elements type of {@code R}
     */
    public static <T, R> List<R> map(List<T> values, Function<T, R> f)
    {
        List<R> result = new ArrayList<>();

        values.forEach((T v) -> result.add(f.apply(v)));

        return result;
    }
}
