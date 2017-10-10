package e_19_09_find_matching_words;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Write a program that reads in words from a file and prompts the user
 * for another word. Print the longest word from the file that contains
 * the given word, or "No match" if the word does not occur in the file.
 * Use the {@code max} method of {@code Stream<String>}.
 */
public class WordMatcher
{
    public static void main(String[] args) throws IOException
    {
        String userInput = getUserInput("Please enter country name: ");
        String path = "early-objects/19-stream-processing/src/main/resources/countries.txt";

        String result = getOptionalResult(userInput, path);

        System.out.println(result);
    }

    /**
     * Gets the longest word from a file that contains the word,
     * provided by user. Otherwise returns "No match" if the word
     * does not occur in the file.
     *
     * @param userInput  the word provided by user
     * @param pathToFile the path to file with words to search for a match
     * @return word containing user input, "No match" otherwise
     * @throws IOException
     */
    public static String getOptionalResult(final String userInput, final String pathToFile) throws IOException
    {
        try (Stream<String> lines = Files.lines(Paths.get(pathToFile))) {
            return lines.filter(w -> w.contains(userInput))
                    .max(Comparator.comparingInt(String::length))
                    .orElse("No match");
        }
    }

    /**
     * Prompts user for input and returns it as a string.
     *
     * @param prompt user prompt
     * @return user input
     */
    public static String getUserInput(final String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.next();
    }
}
