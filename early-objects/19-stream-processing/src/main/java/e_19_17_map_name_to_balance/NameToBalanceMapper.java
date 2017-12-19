package e_19_17_map_name_to_balance;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Assume that a {@code BankAccount} class has methods for yielding the account
 * owner's name and the current balance. Write a function that, given a list of
 * bank accounts, produces a map that associates owner names with the total
 * balance in all their accounts. Use {@code collect} and
 * {@code Collectors.groupingBy}.
 */
public class NameToBalanceMapper
{
    public static void main(String[] args)
    {
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(new BankAccount("Harry Hacker", 1000));
        bankAccountList.add(new BankAccount("Tony Tester", 3000));
        bankAccountList.add(new BankAccount("Carl Cracker", 500));
        bankAccountList.add(new BankAccount("Tony Tester", 3000));
        bankAccountList.add(new BankAccount("Carl Cracker", 50));
        bankAccountList.add(new BankAccount("Harry Hacker", 1000));
        bankAccountList.add(new BankAccount("John Smith", 10_000));

        try (Stream<BankAccount> bankAccountStream = bankAccountList.stream()) {
            Map<String, Double> map = bankAccountStream
                    .collect(
                            Collectors.groupingBy(
                                    BankAccount::getName,
                                    Collectors.summingDouble(BankAccount::getBalance)
                            )
                    );

            map.forEach((k, v) -> System.out.println(k + " : " + v));
        }
    }
}
