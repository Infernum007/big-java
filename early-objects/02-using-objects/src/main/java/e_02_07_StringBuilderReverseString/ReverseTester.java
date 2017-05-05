package e_02_07_StringBuilderReverseString;

/**
 * The {@code StringBuilder} class has a method for reversing a string.
 * In a {@code ReverseTester} class, construct a {@code StringBuilder} from a
 * given string (such as "{@code desserts}"), call the {@code reverse} method
 * followed by the {@code toString} method, and print the result. Also print
 * the expected value.
 */
public class ReverseTester
{
    public static void main(String[] args)
    {
        String string = new StringBuilder("desserts").reverse().toString();

        System.out.println(string);
    }
}
