package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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
        Scanner in = new Scanner(text);
        List<String> words = new ArrayList<>();

        while (in.hasNext()) {
            String word = in.next().replaceAll("\\W", "");
            words.add(word);
        }
        return words;
    }

    /**
     * Gets list of words from a text file. The method strips the words
     * from any non-word character before adding it to the list.
     *
     * @return list of words
     */
    public static List<String> getListOfWordsFromTextFile(String path) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File(path));
        List<String> words = new LinkedList<>();

        while (in.hasNext()) {
            String word = in.next().replaceAll("\\W", "");
            words.add(word);
        }
        return words;
    }
}
