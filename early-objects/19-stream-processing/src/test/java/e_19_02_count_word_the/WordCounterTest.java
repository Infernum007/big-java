package e_19_02_count_word_the;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * {@code WordCounterTest} test class.
 */
public class WordCounterTest
{
    private final static String path = "src/test/resources/population.txt";
    private WordCounter wc;

    @Before
    public void setUp() throws Exception
    {
        this.wc = new WordCounter();
    }

    @Test
    public void countWordsCanCountTwoOrMoreTargetWordsPerLine() throws Exception
    {
        final String word = "the";
        long wordCount = wc.countWords(path, word);
        assertEquals(3, wordCount);
    }

    @Test
    public void countWordsIsGreaterThanZeroIfFileContainsTargetWord() throws Exception
    {
        final String word = "the";
        long wordCount = wc.countWords(path, word);
        assertTrue(wordCount > 0);
    }

    @Test
    public void countWordsReturnsZeroIfFileDoesNotContainTargetWord() throws Exception
    {
        final String word = "bulldozer";
        long wordCount = wc.countWords(path, word);
        assertEquals(0, wordCount);
    }
}
