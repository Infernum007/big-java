package e_19_15_group_words_by_length;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static utils.ListUtils.getListOfWordsFromTextFile;
import static utils.TextFilePaths.ALICE;

/**
 * Read all words in a file and group them by length. Print out how many
 * words of each length are in the file. Use {@code collect} and
 * {@code Collectors.groupingBy}.
 */
public class GroupByLength
{
    public static void main(String[] args) throws IOException
    {
        List<String> words = getListOfWordsFromTextFile(ALICE.toString());

        try (Stream<String> wordsStream = words.stream()) {
            Map<Integer, Long> groupedByLength = wordsStream
                    .filter(w -> w.length() > 0)
                    .collect(groupingBy(String::length, counting()));

            groupedByLength.forEach((k, v) -> System.out.println(k + " : " + v));
        }
    }
}
