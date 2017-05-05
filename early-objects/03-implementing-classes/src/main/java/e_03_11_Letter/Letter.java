package e_03_11_Letter;

/**
 * Provide a class for authoring a simple letter. In the constructor, supply
 * the file of the sender and the recipient:
 * <p><pre>
 *      public Letter(String from, String to)</pre>
 * Supply a method
 * <p><pre>
 *      public void addLine(String line)</pre>
 * to add a line of text to the body of the letter. Supply a method
 * <p><pre>
 *      public String getText()</pre>
 * that returns the entire text of the letter. The text has the form:
 * <p><pre>
 *      Dear <em>recipient name:
 *      blank line
 *      first line of the body
 *      second line of the body
 *      . . .
 *      last line of the body
 *      blank line
 *      Sincerely,
 *      blank line
 *      sender name</em></pre>
 * Also supply a class {@code LetterPrinter} that prints this letter.
 * <p><pre>
 *      Dear John:
 *
 *      I am sorry we must part.
 *      I wish you all the best.
 *
 *      Sincerely,
 *
 *      Mary</pre>
 * Construct an object of the {@code Letter} class and call {@code addLine}
 * twice. Hints: (1) Use the {@code concat} method to form a longer string from
 * two shorter strings. (2) The special string {@code "\n"} represents a new
 * line. For example, the statement
 * <p><pre>
 *      body = body.concat("Sincerely,").concat("\n");</pre>
 * adds a line containing the string {@code "Sincerely,"} to the body.
 */
public class Letter
{
    private String sender;
    private String recipient;
    private String body;

    /**
     * Constructs a letter with sender and recipient file as parameter.
     *
     * @param from the sender
     * @param to   the recipient
     */
    Letter(String from, String to)
    {
        sender = from;
        recipient = to;
        body = "";
    }

    /**
     * Adds a line supplied as parameter to the body of letter.
     *
     * @param line the line of text
     */
    void addLine(String line)
    {
        body = body.concat(line + "\n");
    }

    /**
     * Builds the entire letter and returns it to the calling method.
     *
     * @return the letter
     */
    String getText()
    {
        String letter = "Dear " + recipient + ":\n\n";
        letter += body + "\n";
        letter += "Sincerely, \n\n" + sender;
        return letter;
    }

}
