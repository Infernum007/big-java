package e_19_02_count_word_the;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program that reads all words from a file and,
 * using a Stream<String>, prints how many of them are the word "the".
 */
public class WordCounter
{
    public static void main(String[] args) throws FileNotFoundException
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
    public long countWords(String pathToFile, String word) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File(pathToFile));
        List<String> wordList = new LinkedList<>();

        while (in.hasNext()) {
            wordList.add(in.next());
        }

        return wordList.stream().filter(w -> w.contains(word)).count();
    }
}
