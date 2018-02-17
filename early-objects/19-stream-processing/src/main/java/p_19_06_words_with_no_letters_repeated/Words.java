package p_19_06_words_with_no_letters_repeated;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
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
                    .filter(Words::hasNoRepeatedLetterUsingIntStream)
                    .filter(w -> w.length() >= 13)
                    .collect(Collectors.toList());

            list.forEach(System.out::println);
            System.out.println("List size = " + list.size());
        }
    }

    public static boolean hasNoRepeatedLetterUsingIntStream(final String word)
    {
        return word.toLowerCase().codePoints().distinct().sum()
                == word.toLowerCase().codePoints().sum();
    }

    public static boolean hasNoRepeatedLetterUsingString(final String word)
    {
        return word.toLowerCase().codePoints()
                .distinct()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString()
                .length() == word.length();
    }

    public static boolean hasNoRepeatedLetter(final String word)
    {
        return word.toLowerCase().codePoints()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet())
                .size() == word.length();
    }
}
