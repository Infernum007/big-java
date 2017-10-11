package utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class with utility methods for lists.
 */
public class ListUtils
{
    /**
     * Gets list of words from a string. The method strips the words
     * from any non-word character before adding it to the list.
     *
     * @return list of words
     */
    public static List<String> getListOfWordsFromString(String text)
    {
        return Arrays.asList(text.split("\\PL+"));
    }

    /**
     * Gets list of words from a text file. The method strips the words
     * from any non-word character before adding it to the list.
     *
     * @return list of words
     */
    public static List<String> getListOfWordsFromTextFile(String path) throws IOException
    {
        String contents = new String(
                Files.readAllBytes(Paths.get(path)),
                StandardCharsets.UTF_8
        );
        return Arrays.asList(contents.split("\\PL+"));
    }

    /**
     * Reads text file line by line and returns a list of collected lines.
     *
     * @param path the path to the text file
     * @return list of lines from text file
     * @throws IOException
     */
    public static List<String> getListOfLinesFromTextFile(String path) throws IOException
    {
        try (Stream<String> lines = Files.lines(Paths.get(path), StandardCharsets.UTF_8)) {
            return lines.collect(Collectors.toList());
        }
    }
}
