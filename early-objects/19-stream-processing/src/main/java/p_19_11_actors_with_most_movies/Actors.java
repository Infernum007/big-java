package p_19_11_actors_with_most_movies;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a program to determine the 100 actors with the most movies,
 * and the number of movies in which they appear. For each movie,
 * produce a map whose keys are the actors, all with value 1.
 * Merge those maps as in Exercise P19.10. Then extract the top 100
 * actors from a stream of actors.
 */
public class Actors
{
    private static final String MOVIES_DATA_SET_FILE = "movies.txt";

    public static void main(String[] args) throws IOException
    {
        List<Movie> movieList = readMovies(getFile(MOVIES_DATA_SET_FILE));

        try (Stream<Movie> movies = movieList.stream()) {
            Map<String, Integer> actorCount = new HashMap<>();

            movies.flatMap(movie -> movie.getActors().stream())
                    .forEach(actor -> actorCount.merge(actor, 1, Integer::sum));

            Map<String, Integer> result =
                    actorCount.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(100)
                    .collect(Collectors.toMap(
                            Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new
                    ));

            result.forEach((k, v) -> System.out.printf("%-30s : %d%n", k, v));
            System.out.printf("%-30s : %,d%n", "Total number of unique actors", result.size());
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
