package utils;

import java.util.*;

/**
 * Class with utility methods for lists.
 */
public class SetUtils
{
    /**
     * Gets set of words from a string. The method strips the words
     * from any non-word character before adding them to the set.
     *
     * @return set of words
     */
    public static Set<String> getSetOfWordsFromString(String text)
    {
        Scanner in = new Scanner(text);
        Set<String> words = new HashSet<>();

        while (in.hasNext()) {
            String word = in.next().replaceAll("\\W", "");
            words.add(word);
        }
        return words;
    }
}
