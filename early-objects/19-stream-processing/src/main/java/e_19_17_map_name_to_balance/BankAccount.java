package e_19_17_map_name_to_balance;

/**
 * A bank account has an owner's name and a balance
 * that can be changed by deposits and withdrawals.
 */
public class BankAccount
{
    private String name;
    private double balance;

    /**
     * Constructs a bank account with a given name and balance.
     */
    public BankAccount(final String name, final double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)
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

    /**
     * Gets the name of the bank account owner.
     *
     * @return the name of the bank account owner
     */
    public String getName()
    {
        return name;
    }
}
