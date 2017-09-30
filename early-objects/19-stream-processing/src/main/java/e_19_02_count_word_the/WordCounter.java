package e_19_02_count_word_the;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Write a program that reads all words from a file and,
 * using a Stream<String>, prints how many of them are the word "the".
 */
public class WordCounter
{
    public static void main(String[] args) throws IOException
    {
        WordCounter wc = new WordCounter();

        String path = "early-objects/19-stream-processing/src/main/resources/population.txt";
        String word = "the";

        long result = wc.countWords(path, word);

        System.out.println("Number of \"" + word + "\" word in the file is " + result);
    }

    /**
     * Counts the number of lines in the text file containing specific word.
     *
     * @param pathToFile the path to file to read lines from
     * @param word       the word to find in the line
     * @return the number of lines containing specific word
     */
    public long countWords(String pathToFile, String word) throws IOException
    {
        String contents = new String(Files.readAllBytes(Paths.get(pathToFile)), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        System.out.println(words);

        try (Stream<String> wordStream = words.stream()) {
            return wordStream.filter(w -> w.equals(word)).count();
        }
    }
}
