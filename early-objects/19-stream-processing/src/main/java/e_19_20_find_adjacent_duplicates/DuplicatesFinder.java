package e_19_20_find_adjacent_duplicates;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * Find all adjacent duplicates of a {@code Stream&lt;String&gt;},
 * by using a predicate that compares each element against the
 * previous one (stashed away in an array of length 1), updates
 * the array, and returns the result of the comparison. You have
 * to be careful with the first element.
 */
public class DuplicatesFinder
{
    public static void main(String[] args)
    {
        String string = "01232228011010000";

        IntPredicate isAdjacent = i -> string.charAt(i - 1) == string.charAt(i);

        IntStream.range(1, string.length())
                .filter(isAdjacent)
                .mapToObj(i -> String.format("index %2d, value %s", i, string.charAt(i)))
                .forEach(System.out::println);
    }
}
