package p_19_07_word_with_one_vowel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static utils.TextFilePaths.WORDS;

/**
 * Using an approach similar to that in Worked Example 19.1, find all words
 * with exactly one vowel (which might be repeated). What is the longest one?
 * How many such words exist for each length?
 */
public class Words
{
    public static void main(String[] args) throws IOException
    {
        final char ch = 'o';

        try (Stream<String> lines = Files.lines(Paths.get(WORDS.toString()))) {
            Map<Integer, List<String>> map = lines
                    .filter(w -> !w.endsWith("'s"))
                    .filter(w -> hasOneVowel(ch, w))
                    .collect(Collectors.groupingBy(String::length));

            System.out.println("Character: " + ch);
            System.out.printf("%s : %s%n", "Len", "Num");
            map.forEach((k, v) -> System.out.printf("%3d : %3d%n", k, v.size()));
        }
    }

    /**
     * Returns true if finds a word with exactly one vowel
     * (which might be repeated).
     *
     * @param ch   the vowel to search in the word
     * @param word the word to search for vowel
     * @return true if vowel is found
     */
    public static boolean hasOneVowel(final char ch, final String word)
    {
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
            return false;
        }

        final long w1 = word.toLowerCase().codePoints()
                .filter(c -> c == ch)
                .sum();

        final long w2 = word.toLowerCase().codePoints()
                .filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                .count();

        return w2 != 0 && w1 / w2 == ch;
    }
}
