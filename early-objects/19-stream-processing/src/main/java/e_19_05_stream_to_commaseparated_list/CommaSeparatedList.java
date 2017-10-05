package e_19_05_stream_to_commaseparated_list;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a method
 * <pre>{@code
 *      public static <T> String toString(Stream<T> stream, int n)
 * }</pre>
 * that turns a {@code Stream<T>} into a comma-separated list
 * of its first {@code n} elements.
 */
public class CommaSeparatedList
{
    public static void main(String[] args) throws IOException
    {
        String path = "early-objects/19-stream-processing/src/main/resources/countries.txt";
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            String commaSeparated = toString(lines, 5);
            System.out.println(commaSeparated);
        }

        try (Stream<Integer> integerStream = Stream.iterate(-20, n -> n + 1)) {
            String commaSeparated = toString(integerStream, 30);
            System.out.println(commaSeparated);
        }
    }

    /**
     * Turns generic stream into a comma-separated list, type of String.
     * The list size is limited to a given number {@code n} of stream first
     * elements supplied as method argument.
     *
     * @param stream generic stream
     * @param n      number of generic objects from the stream to be converted into a list
     * @param <T>    generic object
     * @return comma-separated list, type of String
     */
    public static <T> String toString(Stream<T> stream, int n)
    {
        return stream
                .limit(n)
                .map(Object::toString)
                .collect(Collectors.joining(","));
    }
}
