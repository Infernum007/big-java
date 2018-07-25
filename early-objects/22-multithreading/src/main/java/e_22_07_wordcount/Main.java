package e_22_07_wordcount;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        args = new String[4];
        args[0] = "alice30.txt";
        args[1] = "countries.txt";
        args[2] = "war-and-peace.txt";
        args[3] = "words.txt";

        for (final String arg : args) {
            WordCounter wc = new WordCounter(arg);
            Thread wct = new Thread(wc);
            wct.start();
        }
    }
}
