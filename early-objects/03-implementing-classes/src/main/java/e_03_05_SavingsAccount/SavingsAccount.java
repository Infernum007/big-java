package e_03_05_SavingsAccount;

/**
 * Write a class {@code SavingsAccount} that is similar to the {@code
 * BankAccount} class, except that it has an added instance variable interest.
 * Supply a constructor that sets both the initial balance and the interest
 * rate. Supply a method {@code addInterest} (with no explicit parameter) that
 * adds interest to the account. Write a {@code SavingsAccountTester} class that
 * constructs a savings account with an initial balance of $1,000 and an
 * interest rate of 10 percent. Then apply the {@code addInterest} method and
 * print the resulting balance. Also compute the expected result by hand and
 * print it.
 */
public class SavingsAccount
{
    private double balance;
    private double interest;

    /**
     * Constructs a bank account with a zero balance.
     */
    public SavingsAccount()
    {
        balance = 0;
        interest = 10;
    }

    /**
     * Constructs a bank account with a given balance.
     *
     * @param initialBalance the initial balance
     */
    public SavingsAccount(double initialBalance)
    {
        balance = initialBalance;
        interest = 10;
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
     */
    public void addInterest()
    {
        balance = balance + (balance * interest) / 100;
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
