package p_19_03_prime_palindrome;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * Repeat Exercise P19.2 with prime numbers instead of perfect squares.
 */
public class PrimePalindromeEvaluator
{
    public static void main(String[] args)
    {
        PrimePalindromeEvaluator evaluator = new PrimePalindromeEvaluator();

        Stream<BigInteger> bigIntStream = evaluator.getPrimesStream(10_000_000);

        bigIntStream.forEach(System.out::println);
    }

    public Stream<BigInteger> getPrimesStream(final int n)
    {
        return Stream.iterate(BigInteger.valueOf(2), i -> i.add(BigInteger.ONE))
                .limit(n)
                .filter(this::isPrime)
                .filter(this::isPalindrome);
    }

    public boolean isPrime(final BigInteger bigInteger)
    {
        final int certainty = 8;
        return bigInteger.isProbablePrime(certainty);
    }

    public boolean isPalindrome(final BigInteger bigInteger)
    {
        String forward = bigInteger.toString().codePoints()
                .collect(StringBuilder::new,
                         StringBuilder::appendCodePoint,
                         StringBuilder::append)
                .toString();
        String backward = new StringBuilder(forward).reverse().toString();
        return forward.equals(backward);
    }
}
