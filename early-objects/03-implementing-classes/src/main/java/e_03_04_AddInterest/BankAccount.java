package e_03_04_AddInterest;

/**
 * Add a method
 * <p><pre>
 *      public void addInterest(double rate)</pre>
 * to the {@code BankAccount} class that adds interest at the given rate. For
 * example, after the statements
 * <p><pre>
 *      BankAccount momsSavings = new BankAccount(1000);
 *      momsSavings.addInterest(10); // 10 percent interest</pre>
 * the balance in {@code momsSavings} is $1,100. Also supply a
 * {@code BankAccountTester} class that prints the actual and expected balance.
 */
public class BankAccount
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
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
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
     * Adds interest to the bank account.
     *
     * @param rate interest rate
     */
    public void addInterest(double rate)
    {
        balance = balance + (balance * rate) / 100;
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
}
