package p_22_01_find_word_in_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class FindDemoWitRunnable {

    public static void main(String[] args) {
        args = new String[5];
        args[0] = "God";
        args[1] = "alice30.txt";
        args[2] = "countries.txt";
        args[3] = "war-and-peace.txt";
        args[4] = "words.txt";

        final String keyWord = args[0];

        for (int i = 1; i < args.length; i++) {
            final String fileName = args[i];
            final URL path = Find.class.getClassLoader().getResource(fileName);
            Runnable searcher = () -> {
                if (path != null) {
                    search(keyWord, path);
                } else {
                    System.out.printf("File %s not found%n", fileName);
                }
            };
            new Thread(searcher).start();
        }
    }

    private static void search(final String keyWord, final URL pathToFile) {
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
}
