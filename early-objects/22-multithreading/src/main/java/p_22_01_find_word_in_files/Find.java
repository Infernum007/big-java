package p_22_01_find_word_in_files;


import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

/**
 * Write a program {@code Find} that searches all files specified on the command
 * line and prints out all lines containing a reserved keyWord. Start a new thread
 * for each file. For example, if you call
 * <p><pre>
 *      java Find Buff report.txt address.txt Homework.java</pre>
 * then the program might print
 * <p><pre>
 *      report.txt: Buffet style lunch will be available at the
 *      address.txt: Buffet, Warren|11801 Trenton Court|Dallas|TX
 *      Homework.java: BufferedReader in;
 *      address.txt: Walters, Winnie|59 Timothy Circle|Buffalo|MI</pre>
 */
public class Find implements Runnable {

    private final String keyWord;
    private final String fileName;

    public Find(String keyWord, String fileName) {
        this.keyWord = keyWord;
        this.fileName = fileName;
    }

    private void wordSearch(final URL pathToFile) {
        final File file = new File(pathToFile.getFile());
        try (final Scanner in = new Scanner(file, "UTF-8")) {
            int lineNumber = 0;
            while (in.hasNextLine()) {
                lineNumber++;
                String line = in.nextLine();
                if (line.contains(keyWord)) {
                    System.out.printf("%s:%d:%s%n", file.getName(), lineNumber, line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        final URL path = Find.class.getClassLoader().getResource(fileName);
        if (path != null) {
            wordSearch(path);
        } else {
            System.out.printf("%s is not found", fileName);
        }
    }

}
