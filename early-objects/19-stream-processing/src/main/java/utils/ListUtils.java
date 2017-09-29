package utils;

import java.util.ArrayList;
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
}
