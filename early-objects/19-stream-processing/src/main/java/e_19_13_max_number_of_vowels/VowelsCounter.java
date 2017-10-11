package e_19_13_max_number_of_vowels;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Read all words from a file and print the one with the maximum number of
 * vowels. Use a {@code Stream<String>} and the max method. Extra credit if
 * you define the comparator with the {@code Comparator.comparing} method
 * described in Special Topic 19.4.
 */
public class VowelsCounter
{
    public static void main(String[] args) throws IOException
    {
        Path path = Paths.get("early-objects/19-stream-processing/src/main/resources/alice30.txt");
        String contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        // First
        Optional<String> result = getMaxVowels(contents);
        result.ifPresent(
                s -> System.out.println(s + " max number of vowels in the word.")
        );

        // Second
        Optional<String> resultWithPattern = getMaxVowelsWithPattern(contents);
        resultWithPattern.ifPresent(
                s -> System.out.println(s + " max number of vowels in the word.")
        );
    }

    public static Optional<String> getMaxVowels(String contents)
    {
        try (Stream<String> words = Stream.of(contents.split("\\PL+"))) {
            return words
                    .map(s -> s.replaceAll("[^aouieAOUIE]", ""))
                    .max(Comparator.comparing(String::length));
        }
    }

    public static Optional<String> getMaxVowelsWithPattern(String contents)
    {
        try (Stream<String> words = Pattern.compile("\\PL+").splitAsStream(contents)) {
            return words
                    .map(s -> s.replaceAll("[^aouieAOUIE]", ""))
                    .max(Comparator.comparing(String::length));
        }
    }
}
