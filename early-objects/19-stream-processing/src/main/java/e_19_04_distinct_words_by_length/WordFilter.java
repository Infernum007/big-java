package e_19_04_distinct_words_by_length;

import utils.ListUtils;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Write a program that reads all words from a file and, using
 * a Stream&lt;String&gt;, prints all distinct words with
 * at most four letters (in some order).
 */
public class WordFilter
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String path = "early-objects/19-stream-processing/src/main/resources/alice30.txt";

        List<String> words = ListUtils.getListOfWordsFromTextFile(path);

        words.stream()
                .filter(w -> w.length() > 4)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
