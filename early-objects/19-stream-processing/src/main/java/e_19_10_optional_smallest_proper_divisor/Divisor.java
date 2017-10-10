package e_19_10_optional_smallest_proper_divisor;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Write a method
 * <pre>{@code
 *      public static Optional<Integer> smallestProperDivisor(int n)
 * }</pre>
 * that returns the smallest proper divisor of {@code n} or, if {@code n}
 * is a prime number, a value indicating that no result is present.
 */
public class Divisor
{
    public static void main(String[] args)
    {
        int n = 49;

        Optional<Integer> spd = smallestProperDivisor(n);

        System.out.println(spd.orElse(-1));
    }

    public static Optional<Integer> smallestProperDivisor(int n)
    {
        if (n <= 0) {
            throw new IllegalArgumentException("n is less or equal to 0");
        }

        try (Stream<Integer> integerStream = Stream.iterate(2, x -> x + 1)) {
            return integerStream
                    .limit(n / 2)
                    .filter(x -> n % x == 0 && !(n == 2))
                    .findFirst();
        }
    }
}
