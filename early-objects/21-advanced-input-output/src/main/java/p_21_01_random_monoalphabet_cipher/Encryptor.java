package p_21_01_random_monoalphabet_cipher;

/**
 * <em>Random monoalphabet cipher</em>. The Caesar cipher, which shifts all
 * letters by a fixed amount, is far too easy to crack. Here is a better idea.
 * For the key, don't use numbers but words. Suppose the keyword is {@code
 * FEATHER}. Then first remove duplicate letters, yielding {@code FEATHR},
 * and append the other letters of the alphabet in reverse order. Now encrypt
 * the letters as follows:
 * <pre>{@code
 *      A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 *      | | | | | | | | | | | | | | | | | | | | | | | | | |
 *      F E A T H R Z Y X W V U S Q P O N M L K J I G D C B}</pre>
 * Write a program that encrypts or decrypts a file using this cipher.
 * The keyword is specified with the {@code -k} command line option.
 * The {@code -d} command line option specifies decryption. For example,
 * <pre>{@code
 *      java Encryptor -d -k FEATHER encrypt.txt output.txt}</pre>
 * decrypts a file using the keyword {@code FEATHER}. It is an error
 * not to supply a keyword.
 */
public class Encryptor
{
    public static void main(String[] args)
    {
        final int argsLen = args.length;
        final int argsToEncrypt = 4;
        final int argsToDecrypt = 5;
        if (argsLen < argsToEncrypt || argsLen > argsToDecrypt || !argsAreValid(args)) {
            printUsage();
            return;
        }

        MonoalphabetCipher cipher = new MonoalphabetCipher();

        final String option = args[0];
        switch (option) {
            case "-d":
                cipher.process(cipher.getDecryptionCipher(args[2]), args[3], args[4]);
                break;
            case "-k":
                cipher.process(cipher.getEncryptionCipher(args[1]), args[2], args[3]);
                break;
            default:
                printUsage();
                break;
        }
    }

    private static boolean argsAreValid(final String[] args)
    {
        final int argsLength = args.length;
        final int threeArgs = 3;
        for (int i = argsLength - 1; i >= argsLength - threeArgs; i--) {
            final String arg = args[i];
            if (arg.isEmpty()) return false;
        }

        final boolean toDecrypt = args[0].equals("-d") && args[1].equals("-k");
        final boolean toEncrypt = args[0].equals("-k");

        return toDecrypt || toEncrypt;
    }

    private static void printUsage()
    {
        System.out.println("Usage: java Encryptor [-d] -k KEYWORD INFILE OUTFILE");
    }
}
