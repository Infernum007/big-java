package p_19_04_factorials_stream;

import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * Produce an infinite stream that contains the factorials 1!, 2!, 3!,
 * and so on. Hint: First produce a stream containing arrays [1, 1!],
 * [2, 2!], [3, 3!], and so on. Use {@code BigInteger} values for the
 * factorials.
 */
public class FactorialStreamGenerator
{
    public static void main(String[] args)
    {
        Stream<BigInteger> factorialStream = getFactorialStream(10);
        factorialStream.forEach(System.out::println);
    }

    public static Stream<BigInteger> getFactorialStream(final int n)
    {
        return Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
                .mapToInt(BigInteger::intValue)
                .mapToObj(FactorialStreamGenerator::getGuavaFactorial)
                .map(i -> i[1])
                .limit(n);
    }

    public static BigInteger[] getNaiveFactorial(final int n)
    {
        BigInteger bigIntResult = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            bigIntResult = bigIntResult.multiply(new BigInteger(i + ""));
        }
        return new BigInteger[]{ BigInteger.valueOf(n), bigIntResult };
    }

    public static BigInteger[] getGuavaFactorial(final int n)
    {
        return new BigInteger[]{ BigInteger.valueOf(n), BigIntegerMath.factorial(n) };
    }
}
