package p_19_06_words_with_no_letters_repeated;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static utils.TextFilePaths.WORDS;

/**
 * Using an approach similar to that in Worked Example 19.1, find all words
 * with length of at least ten in which no letter is repeated. What is the
 * longest one? How many such words exist for each length?
 */
public class Words
{
    public static void main(String[] args) throws IOException
    {
        try (Stream<String> lines = Files.lines(Paths.get(WORDS.toString()))) {
            List<String> list = lines
                    .filter(w -> !w.endsWith("'s"))
                    .filter(Words::hasNoRepeatedLetter)
                    .filter(w -> w.length() >= 13)
                    .collect(Collectors.toList());

            list.forEach(System.out::println);
            System.out.println("List size = " + list.size());
        }
    }

    public static boolean hasNoRepeatedLetter(final String word)
    {
        Set<Character> charSet = word.toLowerCase().codePoints()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        return charSet.size() == word.length();
    }
}
