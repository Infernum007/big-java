package p_19_01_measure_parallel_stream_time

import spock.lang.Specification

import java.util.stream.IntStream

/**
 * {@code IntStreamsUtilSpec} class.
 */
class IntStreamsUtilSpec extends Specification {

    IntStreamsUtil intStreamsUtil

    void setup() {
        intStreamsUtil = new IntStreamsUtil()
        assert intStreamsUtil != null
    }

    def "test regular IntStream speed"() {
        setup:

        start
        IntStream regularIntStream = intStreamsUtil.getRegularIntStream(n)
        end

        printf("%s %-17d = %d%n", "Nanos taken for regular IntStream of size", n, result)

        where:
        n                     | start             | end               || result
        10                    | System.nanoTime() | System.nanoTime() || end - start
        100                   | System.nanoTime() | System.nanoTime() || end - start
        1_000                 | System.nanoTime() | System.nanoTime() || end - start
        10_000                | System.nanoTime() | System.nanoTime() || end - start
        100_000               | System.nanoTime() | System.nanoTime() || end - start
        1_000_000             | System.nanoTime() | System.nanoTime() || end - start
        10_000_000            | System.nanoTime() | System.nanoTime() || end - start
        100_000_000           | System.nanoTime() | System.nanoTime() || end - start
        1_000_000_000         | System.nanoTime() | System.nanoTime() || end - start
        10_000_000_000        | System.nanoTime() | System.nanoTime() || end - start
        1_000_000_000_000     | System.nanoTime() | System.nanoTime() || end - start
        1_000_000_000_000_000 | System.nanoTime() | System.nanoTime() || end - start
    }

    def "test parallel IntStream speed"() {
        setup:

        start
        IntStream parallelIntStream = intStreamsUtil.getParallelIntStream(n)
        end

        printf("%s %-16d = %d%n", "Nanos taken for parallel IntStream of size", n, result)

        where:
        n                     | start             | end               || result
        10                    | System.nanoTime() | System.nanoTime() || end - start
        100                   | System.nanoTime() | System.nanoTime() || end - start
        1_000                 | System.nanoTime() | System.nanoTime() || end - start
        10_000                | System.nanoTime() | System.nanoTime() || end - start
        100_000               | System.nanoTime() | System.nanoTime() || end - start
        1_000_000             | System.nanoTime() | System.nanoTime() || end - start
        10_000_000            | System.nanoTime() | System.nanoTime() || end - start
        100_000_000           | System.nanoTime() | System.nanoTime() || end - start
        1_000_000_000         | System.nanoTime() | System.nanoTime() || end - start
        10_000_000_000        | System.nanoTime() | System.nanoTime() || end - start
        1_000_000_000_000     | System.nanoTime() | System.nanoTime() || end - start
        1_000_000_000_000_000 | System.nanoTime() | System.nanoTime() || end - start
    }
}
