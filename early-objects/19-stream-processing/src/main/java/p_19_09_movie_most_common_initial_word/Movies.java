package p_19_09_movie_most_common_initial_word;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * What are the 100 most common initial words in movie titles
 * contained in the data set in Worked Example 19.2?
 */
public class Movies
{
    private static final String MOVIES_DATA_SET_FILE = "movies.txt";

    public static void main(String[] args) throws IOException
    {
        List<Movie> movieList = readMovies(getFile(MOVIES_DATA_SET_FILE));

        try (Stream<Movie> movies = movieList.stream()) {
            Map<String, Long> result = movies
                    .map(movie -> movie.getTitle().split(" "))
                    .collect(Collectors.groupingBy(m -> m[0], Collectors.counting()))
                    .entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(100)
                    .collect(Collectors.toMap(
                            Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new)
                    );

            result.forEach((k, v) -> System.out.printf("%-13s %s%n", k, v));
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
