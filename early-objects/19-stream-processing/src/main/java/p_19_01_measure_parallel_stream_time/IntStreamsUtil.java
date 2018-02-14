package p_19_01_measure_parallel_stream_time;

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * In a stream of random integers, filter out the even ones, call
 * {@code limit(n)}, and count the result. Set {@code n} to 10, 100,
 * 1000, and so on. Measure the amount of time these operations take
 * with a regular stream and a parallel stream. How big does {@code n}
 * have to be for parallel streams to be faster on your computer?
 */
public class IntStreamsUtil
{
    /**
     * Gets regular {@code IntStream} limited with number
     * supplied in method argument.
     *
     * @param n the number to limit {@code IntStream} size
     * @return stream of integers
     */
    public IntStream getRegularIntStream(final long n)
    {
        IntPredicate intPredicate = i -> i % 2 != 0;
        return new Random().ints(n).filter(intPredicate);
    }

    /**
     * Gets parallel {@code IntStream} limited with number
     * supplied in method argument.
     *
     * @param n the number to limit {@code IntStream} size
     * @return stream of integers
     */
    public IntStream getParallelIntStream(final long n)
    {
        IntPredicate intPredicate = i -> i % 2 != 0;
        return new Random().ints(n).filter(intPredicate).parallel();
    }
}
