package e_02_06_HolleWerld;

/**
 * Write a program {@code HollePrinter} that switches the letters "e" and "o"
 * in a string. Use the replace method repeatedly. Demonstrate that the string
 * "Hello, World!" turns into "Holle, Werld!"
 */
public class HollePrinter
{
    private String string;

    /**
     * Constructs {@code HollePrinter} object and
     * initialises string to "Hello, World!".
     */
    public HollePrinter()
    {
        string = "Hello, World!";
    }

    /**
     * Test {@code HollePrinter} class.
     */
    public static void main(String[] args)
    {
        HollePrinter holle = new HollePrinter();

        holle.switchLetters("o", "e");
        holle.switchLetters("He", "Ho");

        System.out.println(holle.getString());
    }

    /**
     * Switches the letters in a string using {@code replace} method.
     *
     * @param toBeReplaced the character to be replaced
     * @param replaceWith  the character to replace with
     */
    public void switchLetters(String toBeReplaced, String replaceWith)
    {
        string = string.replace(toBeReplaced, replaceWith);
    }

    /**
     * Gets the string.
     *
     * @return this string
     */
    public String getString()
    {
        return string;
    }
}
