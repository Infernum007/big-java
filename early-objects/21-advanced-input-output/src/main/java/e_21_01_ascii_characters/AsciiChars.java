package e_21_01_ascii_characters;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Write a program that opens a binary file and prints all ASCII characters
 * from that file, that is, all bytes with values between 32 and 126. Print
 * a new line after every 64 characters. What happens when you use your
 * program with word processor documents? With Java class files?
 */
public class AsciiChars
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input file: ");
        String inFile = in.next();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inFile))) {
            int next;
            int count = 0;
            while ((next = bis.read()) != -1) {
                if (next > 31 && next < 127) System.out.print((char) next);
                if (count % 64 == 0) System.out.println();
                count++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
