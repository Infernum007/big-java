package utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        List<String> wordsList = ListUtils.getListOfWordsFromString(text);
        return new HashSet<>(wordsList);
    }
}
