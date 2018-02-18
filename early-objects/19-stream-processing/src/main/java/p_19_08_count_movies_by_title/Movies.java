package p_19_08_count_movies_by_title;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Perhaps the reason that so many movie titles start with the letter A is
 * that their first word is "A" or "An"? Count how many movies in the data
 * set of Worked Example 19.2 start with these words.
 */
public class Movies
{
    private static final String MOVIE_FILE_NAME = "movies.txt";

    public static void main(String[] args) throws IOException
    {
        List<Movie> movieList = readMovies(getMoviesFile(MOVIE_FILE_NAME));

        try (Stream<Movie> movies = movieList.stream()) {
            long count = movies
                    .filter(w -> {
                        final String title = w.getTitle();
                        return title.startsWith("A ") || title.startsWith("An ");
                    })
                    .count();
            System.out.println("Number of movies starting with 'A' and 'An': " + count);
        }
    }

    public static boolean commonActorAndDirector(Movie m)
    {
        return m.getDirectors().stream().anyMatch(d -> m.getActors().contains(d));
    }

    private static Set<String> intersect(final Collection<String> a, final Collection<String> b)
    {
        Set<String> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        return intersection;
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

    public static File getMoviesFile(final String fileName)
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
