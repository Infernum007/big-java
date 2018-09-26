package e_22_08_wordcount_combined;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Enhance the program of Exercise E22.7 so that the last active thread also
 * prints a combined count. Use locks to protect the combined word count and
 * a counter of active threads.
 */
public class WordCount implements Runnable {

    private final static int DELAY = 1;
    private final Total total;
    private final String fileName;

    public WordCount(final String fileName, final Total total) {
        this.total = total;
        this.fileName = fileName;
    }


    /**
     * Counts the number of words in the file separated by space.
     *
     * @param pathToFile the path to file to read lines from
     * @return the number of words in the file
     */
    public long countWords(URL pathToFile) {
        try {
            String contents = new String(Files.readAllBytes(Paths.get(pathToFile.toURI())), StandardCharsets.UTF_8);
            List<String> words = Arrays.asList(contents.split("\\s+"));
            return words.size();
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public void run() {
        try {
            System.out.printf("%-17s running in %s %s%n", fileName, Thread.currentThread().getThreadGroup().getName(), Thread.currentThread().getName());
            final URL path = WordCount.class.getClassLoader().getResource(fileName);
            final long result = this.countWords(path);
            total.setTotal(result);
            System.out.printf("%-17s | %d%n", fileName, result);
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (Thread.currentThread().getThreadGroup().activeCount() == 1) {
            System.out.printf("%-17s | %d%n", "total", total.getTotal());
        }
    }

}
