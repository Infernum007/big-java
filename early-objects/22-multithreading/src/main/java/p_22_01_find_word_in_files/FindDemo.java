package p_22_01_find_word_in_files;

public class FindDemo {

    public static void main(String[] args) {
        args = new String[5];
        args[0] = "God";
        args[1] = "alice30.txt";
        args[2] = "countries.txt";
        args[3] = "war-and-peace.txt";
        args[4] = "words.txt";

        final String wordToFind = args[0];

        for (int i = 1; i < args.length; i++) {
            Thread wft = new Thread(new Find(wordToFind, args[i]));
            wft.start();
        }
    }

}
