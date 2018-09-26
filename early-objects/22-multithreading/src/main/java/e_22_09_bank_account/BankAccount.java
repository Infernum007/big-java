package e_22_09_bank_account;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals.
 */
public class BankAccount
{
    private static final int INSURANCE_LIMIT = 100_000;

    private double balance;
    private Lock balanceChangeLock;
    private Condition insuranceLimitCondition;
    private Condition sufficientFundsCondition;

    /**
     * Constructs a bank account with a zero balance
     */
    public BankAccount()
    {
        balance = 0;
        balanceChangeLock = new ReentrantLock();
        sufficientFundsCondition = balanceChangeLock.newCondition();
        insuranceLimitCondition = balanceChangeLock.newCondition();
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(final double amount)
    {
        balanceChangeLock.lock();
        try {

            while (balance >= INSURANCE_LIMIT) {
                insuranceLimitCondition.await();
            }

            System.out.printf("%-12s %.2f", "Depositing", amount);
            double newBalance = balance + amount;
            System.out.printf(", new balance = %.2f%n", newBalance);
            this.balance = newBalance;

            sufficientFundsCondition.signalAll();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            balanceChangeLock.unlock();
        }
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(final double amount)
    {
        balanceChangeLock.lock();
        try {

            while (balance < amount) {
                sufficientFundsCondition.await();
            }

            System.out.printf("%-12s %.2f", "Withdrawing", amount);
            double newBalance = balance - amount;
            System.out.printf(", new balance = %.2f%n", newBalance);
            balance = newBalance;

            insuranceLimitCondition.signalAll();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            balanceChangeLock.unlock();
        }
    }

    /**
     * Gets the balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }
}
