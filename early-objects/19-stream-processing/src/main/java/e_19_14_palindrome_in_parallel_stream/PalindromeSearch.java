package e_19_14_palindrome_in_parallel_stream;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static utils.ListUtils.getListOfLinesFromTextFile;

/**
 * Read all words from a file into an {@code ArrayList<String>}, then turn it
 * into a parallel stream. Use the dictionary file {@code words.txt} provided
 * with the book's companion code. Use filters and the {@code findAny} method
 * to find any palindrome that has at least five letters, then print the word.
 * What happens when you run the program multiple times?
 */
public class PalindromeSearch
{
    public static void main(String[] args) throws IOException
    {
        String path = "early-objects/19-stream-processing/src/main/resources/words.txt";
        List<String> words = getListOfLinesFromTextFile(path);

        Optional<String> palindrome = words.parallelStream()
                .map(s -> s.replaceAll("\\W", ""))
                .map(String::toLowerCase)
                .filter(s -> s.length() > 4)
                .filter(PalindromeSearch::isPalindrome)
                .findAny();

        System.out.println(palindrome.orElse("No palindromes found"));
    }

    /**
     * Recursive method returns true if string is a palindrome or false
     * otherwise.
     * <p>
     * First, it returns true if str length equals 0 or 1.
     * <p>
     * Second, if first condition is false it checks whether first and last
     * characters are equal, if they are not equal, then the {@code str} is not
     * a palindrome and method returns false. If first and last characters are
     * equal then method {@code isPalindrome} called recursively cutting off
     * the first and last characters and comparing them in each recursion
     * iteration. If all iterations return true, then the string is a palindrome.
     *
     * @param str the given string
     * @return true if given string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str)
    {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        char start = str.charAt(0);
        char end = str.charAt(str.length() - 1);

        return start == end && isPalindrome(str.substring(1, str.length() - 1));
    }
}
