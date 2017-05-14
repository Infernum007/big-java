package p_18_03_pair_min_max_generic_comparable;

/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals.
 */
public class BankAccount implements Comparable<BankAccount>
{
    private double balance;

    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount()
    {
        balance = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     *
     * @param initialBalance the initial balance
     */
    public BankAccount(final double initialBalance)
    {
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(final double amount)
    {
        balance = balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(final double amount)
    {
        balance = balance - amount;
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }

    @Override
    public String toString()
    {
        return "BankAccount[balance=" + balance + "]";
    }

    @Override
    public int compareTo(final BankAccount otherBankAccount)
    {
        return Double.compare(this.balance, otherBankAccount.balance);
    }
}
