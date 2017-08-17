package e_19_01_count_word_the;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * {@code WordCounterTest} test class.
 */
public class WordCounterTest
{
    private final static String path = "src/test/resources/e_19_01_word_counter.txt";

    private WordCounter wc;

    public WordCounterTest()
    {
        this.wc = new WordCounter();
    }

    @Test
    public void countWordIsGreaterThanZeroIfFileContainsTargetWord() throws Exception
    {
        final String word = "the";
        long wordCount = wc.countWord(path, word);
        System.out.println(wordCount);
        assertEquals(3, wordCount);
    }

    @Test
    public void countWordReturnsZeroIfFileDoesNotContainTargetWord() throws Exception
    {
        final String word = "bulldozer";
        long wordCount = wc.countWord(path, word);
        System.out.println(wordCount);
        assertEquals(0, wordCount);
    }
}
