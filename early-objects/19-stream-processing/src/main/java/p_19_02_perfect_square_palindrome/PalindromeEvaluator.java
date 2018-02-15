package p_19_02_perfect_square_palindrome;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * Write a program that generates an infinite stream of integers that are
 * perfect squares and then displays the first {@code n} of them that are
 * palindromes (that is, their decimal representation equals its reverse).
 * Extra credit if you use {@code BigInteger} so that you can find solutions
 * of arbitrary length.
 */
public class PalindromeEvaluator
{
    public static void main(String[] args)
    {
        PalindromeEvaluator evaluator = new PalindromeEvaluator();

        Stream<BigInteger> bigIntegerStream = evaluator.getPalindromesStream(100_000_000);
        bigIntegerStream.forEach(System.out::println);
    }

    public Stream<BigInteger> getPalindromesStream(final int n)
    {
        return Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
                .limit(n)
                .map(i -> i.pow(2))
                .filter(this::isPalindrome);
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
