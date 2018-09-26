package e_22_08_wordcount_combined;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        args = new String[4];
        args[0] = "alice30.txt";
        args[1] = "countries.txt";
        args[2] = "war-and-peace.txt";
        args[3] = "words.txt";

        Total total = new Total();
        ThreadGroup tg = new ThreadGroup("Word Count");

        for (final String arg : args) {
            WordCount wc = new WordCount(arg, total);
            Thread wct = new Thread(tg, wc);
            wct.start();
        }
    }
}
