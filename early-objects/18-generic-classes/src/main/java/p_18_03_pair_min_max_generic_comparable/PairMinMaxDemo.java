package p_18_03_pair_min_max_generic_comparable;

import ArrayUtils.ArrayUtil;

import java.util.Arrays;
import java.util.List;

/**
 * Repeat Exercise P18.2, but refine the bound of the type parameter
 * to extend the generic {@code Comparable} type.
 */
public class PairMinMaxDemo
{
    public static void main(String[] args)
    {
        Coin[] coins = {
                new Coin(0.1, "Dime"),
                new Coin(0.05, "Nickel"),
                new Coin(0.01, "Penny"),
                new Coin(0.25, "Quarter")
        };

        Pair<Coin> minMaxCoins = PairUtil.minmax(coins);
        System.out.println("Actual:   " + minMaxCoins.getFirst().toString());
        System.out.println("Expected: Coin[value=0.01,name=Penny]");
        System.out.println("Actual:   " + minMaxCoins.getSecond().toString());
        System.out.println("Expected: Coin[value=0.25,name=Quarter]");

        System.out.println();

        BankAccount[] accounts = {
                new BankAccount(10.5),
                new BankAccount(50),
                new BankAccount(20),
                new BankAccount(5.65)
        };

        Pair<BankAccount> minMaxAccount = PairUtil.minmax(accounts);
        System.out.println("Actual:   " + minMaxAccount.getFirst().toString());
        System.out.println("Expected: BankAccount[balance=5.65]");
        System.out.println("Actual:   " + minMaxAccount.getSecond().toString());
        System.out.println("Expected: BankAccount[balance=50.0]");

        System.out.println();

        SavingsAccount[] savingsAcc = {
                new SavingsAccount(10),
                new SavingsAccount(0),
                new SavingsAccount(20),
                new SavingsAccount(40),
        };

        Pair<SavingsAccount> minMaxSavings = PairUtil.minmax(savingsAcc);
        System.out.println("Actual:   " + minMaxSavings.getFirst().toString());
        System.out.println("Expected: SavingsAccount[balance=0.0]");
        System.out.println("Actual:   " + minMaxSavings.getSecond().toString());
        System.out.println("Expected: SavingsAccount[balance=40.0]");

        System.out.println();

        Integer[] integers = ArrayUtil.randomIntArray(10, 30);
        System.out.println("Random array: " + Arrays.toString(integers));
        Pair<Integer> minMaxIntegers = PairUtil.minmax(integers);
        System.out.println("Result:       " + minMaxIntegers.toString());

        System.out.println();

        List<String> strSeq = ArrayUtil.randomSequenceOfStrings('A', 'K');
        System.out.println("Random strings: " + strSeq);
        String[] stringsArr = strSeq.toArray(new String[strSeq.size()]);
        Pair<String> minMaxStr = PairUtil.minmax(stringsArr);
        System.out.println("Result:         " + minMaxStr.toString());


    }
}

