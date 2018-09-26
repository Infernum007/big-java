package e_22_09_bank_account;

/**
 * A deposit runnable makes periodic deposits to a bank account.
 */
public class DepositRunnable implements Runnable
{
    private int count;
    private double amount;
    private BankAccount account;
    private static final int DELAY = 1;

    /**
     * Constructs a deposit runnable.
     *
     * @param anAccount the account into which to deposit money
     * @param anAmount  the amount to deposit in each repetition
     * @param aCount    the number of repetitions
     */
    public DepositRunnable(final BankAccount anAccount, final double anAmount, final int aCount)
    {
        this.account = anAccount;
        this.amount = anAmount;
        this.count = aCount;
    }

    @Override
    public void run()
    {
        try {
            for (int i = 0; i <= count; i++) {
                account.deposit(amount);
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
