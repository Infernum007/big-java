package e_19_03_print_all_lines_containing_word_the;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Write a program that reads all lines from a file and, using
 * a Stream&lt;String&gt;, prints all lines containing the word "the".
 */
public class LinePrinter
{
    public static void main(String[] args) throws IOException
    {
        String word = "the";
        String path = "early-objects/19-stream-processing/src/main/resources/alice30.txt";

        printLinesContainingMatchingWord(path, word);
    }

    public static void printLinesContainingMatchingWord(String path, String word) throws IOException
    {
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            lines
                    .filter(w -> w.matches(".+\\b" + word + "\\b.+"))   // filter lines containing word "the"
                    .map(String::toLowerCase)                           // convert all lines to lowercase
                    .map(w -> w.replaceAll("\\bthe\\b", "THE"))         // replace "the" with "THE"
                    .forEach(System.out::println);                      // print all lines containing word "the"
        }
    }
}
