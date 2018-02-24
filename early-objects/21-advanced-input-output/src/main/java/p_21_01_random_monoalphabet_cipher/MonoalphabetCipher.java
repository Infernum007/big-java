package p_21_01_random_monoalphabet_cipher;

import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MonoalphabetCipher
{
    public void process(final Map<Integer, Integer> cipher, final String inFile, final String outFile)
    {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outFile))) {
            int next;
            while ((next = bis.read()) != -1) {
                int character = Character.toUpperCase(next);
                if (cipher.containsKey(character)) {
                    character = cipher.get(character);
                }
                bos.write(character);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<Integer, Integer> getDecryptionCipher(final String keyWord)
    {
        return getEncryptionCipher(keyWord).entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    public Map<Integer, Integer> getEncryptionCipher(final String keyWord)
    {
        IntStream keyStream = keyWord.toUpperCase().codePoints();
        IntStream reverseAlphabet = IntStream.range('A', '[').map(i -> 'A' - i + '[' - 1);
        int[] cipher = IntStream.concat(keyStream, reverseAlphabet).distinct().toArray();

        return IntStream.range(0, cipher.length)
                .boxed()
                .collect(Collectors.toMap(i -> ('A' + i), i -> cipher[i]));
    }

    public void printCipherMap(final Map<Integer, Integer> map)
    {
        map.forEach((k, v) -> System.out.println(Arrays.toString(Character.toChars(k)) + "=>" + Arrays.toString(Character.toChars(v))));
    }
}
