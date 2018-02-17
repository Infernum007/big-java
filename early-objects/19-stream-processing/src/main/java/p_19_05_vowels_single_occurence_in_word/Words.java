package p_19_05_vowels_single_occurence_in_word;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static utils.TextFilePaths.WORDS;

/**
 * Worked Example 19.1 showed you how to find all words with five distinct
 * vowels (which might occur more than once). Using a similar approach,
 * find all words in which each vowel occurs exactly once.
 */
public class Words
{
    private static final int VOWEL_CODEPOINT_SUM = 531;

    public static void main(String[] args) throws IOException
    {
        try (Stream<String> lines = Files.lines(Paths.get(WORDS.toString()))) {
            List<String> list = lines
                    .filter(w -> !w.endsWith("'s"))
                    .filter(Words::hasOnlyFiveDistinctVowels)
                    .limit(20)
                    .collect(Collectors.toList());

            list.forEach(System.out::println);
        }
    }

    public static boolean hasOnlyFiveDistinctVowels(final String word)
    {
        return word.toLowerCase().codePoints()
                .filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                .sum() == VOWEL_CODEPOINT_SUM;
    }

    public static boolean hasFiveVowels(final String word)
    {
        return word.toLowerCase().codePoints()
                .filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                .distinct()
                .count() == 5;
    }
}
