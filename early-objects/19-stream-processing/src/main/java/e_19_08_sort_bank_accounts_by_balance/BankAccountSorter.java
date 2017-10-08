package e_19_08_sort_bank_accounts_by_balance;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Write a program that sorts an array of bank accounts by increasing balance.
 * Pass an appropriate lambda expression to {@code Arrays.sort}.
 */
public class BankAccountSorter
{
    public static void main(String[] args)
    {
        BankAccount[] accounts = {
                new BankAccount(100.00),
                new BankAccount(10.00),
                new BankAccount(0.50),
                new BankAccount(1.00),
                new BankAccount(1000.00),
        };

        System.out.println("Before sort:");
        for (BankAccount acc : accounts) {
            System.out.println(acc.getBalance());
        }

        Arrays.sort(accounts, Comparator.comparingDouble(BankAccount::getBalance));

        System.out.println("After sort:");
        for (BankAccount acc : accounts) {
            System.out.println(acc.getBalance());
        }
    }
}
