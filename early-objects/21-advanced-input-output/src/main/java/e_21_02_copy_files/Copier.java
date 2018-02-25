package e_21_02_copy_files;

import java.io.*;
import java.nio.file.Files;

/**
 * Write a method {@code public static void copy(String infile, String outfile)}
 * that copies all bytes from one file to another, without using {@code Files.copy}.
 */
public class Copier
{
    private final static String FOLDER = "early-objects/21-advanced-input-output/src/main/resources/";

    public static void main(String[] args)
    {
        copy("alice_part.txt", "alice_copy.txt");
    }

    public static void copy(final String inFile, final String outFile)
    {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(FOLDER + outFile))) {
            byte[] data = Files.readAllBytes(new File(FOLDER + inFile).toPath());
            bos.write(data);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
