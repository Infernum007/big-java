package p_19_10_dataset_unique_actors;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a program to determine how many actors there are in the data set in
 * Worked Example 19.2. Note that many actors are in multiple movies. The
 * challenge in this assignment is that each movie has a list of actors,
 * not a single actor, and there is no ready-made collector to form the
 * union of these lists. However, there is another collect method that has
 * three parameters:
 * <p>
 * <ul><li>A function to generate an instance of the target</li>
 * <li>A function to add an element to a target</li>
 * <li>A function to merge two targets into one</li></ul>
 * <p>
 * For example,
 * <pre>{@code  stream.collect(
 *      () -> 0,
 *      (t, e) -> t + e,
 *      (t, u) -> t + u)}</pre>
 * computes the sum of elements in a {@code Stream<Integer>}.
 * Note that the last function is only needed for parallel streams.
 * <p>
 * Define methods for generating a set, adding a list of actors into
 * one, and for combining two sets.
 */
public class UniqueActors
{
    private static final String MOVIES_DATA_SET_FILE = "movies.txt";

    public static void main(String[] args) throws IOException
    {
        List<Movie> movieList = readMovies(getFile(MOVIES_DATA_SET_FILE));

        try (Stream<Movie> movies = movieList.stream().parallel()) {
            Set<String> actors = movies
                    .flatMap(movie -> movie.getActors().stream().parallel())
                    .collect(HashSet::new, HashSet::add, HashSet::addAll);

            System.out.printf("Size: %d%n", actors.size());
            actors.forEach(System.out::println);
        }
    }

    public static List<Movie> readMovies(final File file) throws IOException
    {
        List<Movie> movies = new ArrayList<>();
        try (Scanner in = new Scanner(file)) {
            while (in.hasNextLine()) {
                String nameLine = in.nextLine();
                String yearLine = in.nextLine();
                String directorsLine = in.nextLine();
                String producersLine = in.nextLine();
                String actorsLine = in.nextLine();
                movies.add(new Movie(getString(nameLine),
                                     Integer.parseInt(getString(yearLine)),
                                     getList(directorsLine),
                                     getList(producersLine),
                                     getList(actorsLine)));
            }
        }
        return movies;
    }

    public static File getFile(final String fileName)
    {
        final ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        return new File(Objects.requireNonNull(classLoader.getResource(fileName)).getFile());
    }

    private static List<String> getList(final String line)
    {
        return Stream.of(getString(line).split(", "))
                .collect(Collectors.toList());
    }

    private static String getString(final String line)
    {
        int colon = line.indexOf(":");
        return line.substring(colon + 1).trim();
    }
}
