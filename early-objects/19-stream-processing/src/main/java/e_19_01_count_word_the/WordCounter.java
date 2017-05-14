package e_19_01_count_word_the;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Write a program that reads all lines from a file and,
 * using a {@code Stream<String>}, prints how many of them
 * contain the word "the".
 */
public class WordCounter
{
    public static void main(String[] args)
    {
        WordCounter wc = new WordCounter();

        String path = "early-objects/19-stream-processing/src/main/resources/alice30.txt";
        String word = "the";

        long result = wc.countWord(path, word);

        System.out.println("Number of lines containing \"the\" is " + result);
    }

    /**
     * Counts the number of lines in the text file containing specific word.
     *
     * @param pathToFile the path to file to read lines from
     * @param word       the word to find in the line
     * @return the number of lines containing specific word
     */
    public long countWord(String pathToFile, String word)
    {
        long count = 0;
        try (Stream<String> lines = Files.lines(Paths.get(pathToFile)))
        {
            count = lines.filter(w -> w.contains(word)).count();
        }
        catch (IOException e) { e.printStackTrace(); }
        return count;
    }
}
