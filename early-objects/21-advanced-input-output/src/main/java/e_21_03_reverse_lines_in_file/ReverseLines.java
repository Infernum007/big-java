package e_21_03_reverse_lines_in_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a method that reverses all lines in a file.
 * Read all lines, reverse each line, and write the result.
 */
public class ReverseLines
{
    private final static String FOLDER = "early-objects/21-advanced-input-output/src/main/resources/";

    public static void main(String[] args)
    {
        reverseLines(FOLDER + "alice_part.txt", FOLDER + "out.txt");
    }

    public static void reverseLines(final String inFile, final String outFile)
    {
        try (Stream<String> stream = Files.lines(Paths.get(inFile))) {
            List<String> reversed = stream
                    .map(s -> new StringBuilder(s).reverse().toString())
                    .collect(Collectors.toList());
            Files.write(Paths.get(outFile), reversed);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
