package p_18_01_pair_min_max_measurable;

/**
 * Write a static generic method {@code PairUtil.minmax} that computes the
 * minimum and maximum elements of an array of type {@code T} and returns
 * a pair containing the minimum and maximum value. Require that the array
 * elements implement the {@code Measurable} interface of Chapter 10.
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
    }
}
