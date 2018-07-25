package e_22_07_wordcount;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a program {@code WordCounter} that counts the words in one or more files.
 * Start a new thread for each file. For example, if you call
 * <p><pre>
 *      java WordCounter report.txt address.txt Homework.java</pre>
 * then the program might print
 * <p><pre>
 *      address.txt: 1052
 *      Homework.java: 445
 *      report.txt: 2099</pre>
 */
public class WordCounter implements Runnable
{
    private final static Logger LOGGER = Logger.getLogger(WordCounter.class.getName());
    private final static int DELAY = 1;
    private String fileName;

    public WordCounter(final String fileName)
    {
        this.fileName = fileName;
    }

    /**
     * Counts the number of words in the file separated by space.
     *
     * @param pathToFile the path to file to read lines from
     * @return the number of words in the file
     */
    public long countWords(URL pathToFile)
    {
        try {
            String contents = new String(Files.readAllBytes(Paths.get(pathToFile.toURI())), StandardCharsets.UTF_8);
            List<String> words = Arrays.asList(contents.split("\\s+"));
            return words.size();
        }
        catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public void run()
    {
        try {
            LOGGER.log(Level.INFO, "Running in " + Thread.currentThread().getName());
            URL path = WordCounter.class.getClassLoader().getResource(fileName);
            long result = this.countWords(path);
            System.out.printf("%-17s | %d%n", fileName, result);
            Thread.sleep(DELAY);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
