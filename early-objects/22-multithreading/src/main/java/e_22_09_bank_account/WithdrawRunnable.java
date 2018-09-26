package e_22_09_bank_account;

/**
 * A withdraw runnable makes periodic withdrawals from a bank account.
 */
public class WithdrawRunnable implements Runnable
{
    private final static int DELAY = 1;

    private int count;
    private double amount;
    private BankAccount account;

    /**
     * Constructs a withdraw runnable.
     *
     * @param account the account from which to withdraw money
     * @param amount  the amount to withdraw in each repetition
     * @param count   the number of repetitions
     */
    public WithdrawRunnable(final BankAccount account, final double amount, final int count)
    {
        this.account = account;
        this.amount = amount;
        this.count = count;
    }

    @Override
    public void run()
    {
        try {
            for (int i = 0; i <= count; i++) {
                account.withdraw(amount);
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
