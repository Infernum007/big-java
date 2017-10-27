package e_19_16_avg_length_for_each_letter;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static utils.ListUtils.getListOfWordsFromTextFile;
import static utils.TextFilePaths.ALICE;

/**
 * Read all words in a file and group them by the first letter (in lowercase).
 * Print the average word length for each initial letter. Use {@code collect}
 * and {@code Collectors.groupingBy}.
 */
public class AverageWordLengthToLetterMapper
{
    public static void main(String[] args) throws IOException
    {
        List<String> words = getListOfWordsFromTextFile(ALICE.toString());

        try (Stream<String> aliceStream = words.stream()) {
            Map<String, Double> avgLengthToFirstLetterMapper = aliceStream
                    .filter(w -> w.length() > 0)
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(w -> w.substring(0, 1),
                            Collectors.averagingDouble(String::length)));

            avgLengthToFirstLetterMapper.forEach(
                    (key, value) -> System.out.printf("%s : %.2f%n", key, value));
        }
    }
}
