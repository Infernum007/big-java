package e_02_05_ReplaceTester;

/**
 * Write a program {@code ReplaceTester} that encodes a string by replacing all
 * letters "{@code i}" with "{@code !}" and all letters "{@code s}" with
 * "{@code $}". Use the {@code replace} method. Demonstrate that you can
 * correctly encode the string "Mississippi". Print both the actual
 * and expected result.
 */
public class ReplaceTester
{
    private String string;

    /**
     * Constructs an object with {@code str} parameter.
     *
     * @param str the string to replace characters
     */
    public ReplaceTester(String str)
    {
        this.string = str;
    }

    public static void main(String[] args)
    {
        String str = "Mississippi";
        ReplaceTester replace = new ReplaceTester(str);

        replace.replace("i", "!");
        replace.replace("s", "$");

        System.out.println("Actual: " + replace.getString());
        System.out.println("Expected: " + "M!$$!$$!pp!");
    }

    /**
     * Replaces characters or substrings in the given string.
     *
     * @param toReplace   the string to be replaced
     * @param replaceWith the string to replace with
     */
    public void replace(String toReplace, String replaceWith)
    {
        string = string.replace(toReplace, replaceWith);
    }

    /**
     * Gets the string.
     *
     * @return the string
     */
    public String getString()
    {
        return this.string;
    }
}
