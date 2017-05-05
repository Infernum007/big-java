package p_03_09_enhanceBankAccount;

/**
 * In this project, you will enhance the {@code BankAccount} class and see how
 * abstraction and encapsulation enable evolutionary changes to software.
 * <p>
 * Begin with a simple enhancement: charging a fee for every deposit and
 * withdrawal. Supply a mechanism for setting the fee and modify the {@code
 * deposit} and {@code withdraw} methods so that the fee is levied. Test your
 * resulting class and check that the fee is computed correctly.
 * <p>
 * Now make a more complex change. The bank will allow a fixed number of free
 * transactions (deposits or withdrawals) every month, and charge for
 * transactions exceeding the free allotment. The charge is not levied
 * immediately but at the end of the month.
 * <p>
 * Supply a new method {@code deductMonthlyCharge} to the {@code BankAccount}
 * class that deducts the monthly charge and resets the transaction count.
 * (Hint: Use {@code Math.max(actual transaction count, free transaction count)}
 * in your computation.)
 * <p>
 * Produce a test program that verifies that the fees are calculated
 * correctly over several months.
 */
public class BankAccount
{
    private double balance;
    private int count;

    /**
     * Constructs a bank account with a zero balance.
     */
    BankAccount()
    {
        balance = 0;
        count = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     *
     * @param initialBalance the initial balance
     */
    BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account and charges the fee
     * for the transaction.
     *
     * @param amount     the amount to deposit
     * @param feePercent the fee percent for the transaction
     */
    void deposit(double amount, double feePercent)
    {
        balance = balance + amount;
//        balance = balance - (balance * feePercent / 100);
        count++;
    }

    /**
     * Withdraws money from the bank account and charges the fee
     * for the transaction.
     *
     * @param amount     the amount to withdraw
     * @param feePercent the fee percent for the transaction
     */
    void withdraw(double amount, double feePercent)
    {
        balance = balance - amount;
//        balance = balance - (balance * feePercent / 100);
        count++;
    }

    /**
     * Deducts monthly charge for transactions exceeding free allotment and
     * resets the transactions count.
     *
     * @param freeCount  number of transactions allowed with no charge
     * @param feePercent fee percent for transaction exceeding free allotment
     */
    void deductMonthlyCharge(int freeCount, double feePercent)
    {
        int charge = Math.max(count, freeCount) - freeCount;
        for (int i = 0; i < charge; i++)
        {
            balance = balance - (balance * feePercent / 100);
        }
        count = 0;
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */
    double getBalance()
    {
        return balance;
    }
}
