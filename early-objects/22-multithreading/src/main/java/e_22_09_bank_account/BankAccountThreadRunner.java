package e_22_09_bank_account;

/**
 * Add a condition to the {@code deposit} method of the BankAccount class
 * in Section 22.5, restricting deposits to $100,000 (the insurance limit
 * of the U.S. government). The method should block until sufficient money
 * has been withdrawn by another thread. Test your program with a large
 * number of deposit threads.
 */
public class BankAccountThreadRunner
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();
        final double AMOUNT = 100;
        final int REPETITIONS = 100;
        final int THREADS = 10;

        for (int i = 0; i < THREADS; i++) {
            DepositRunnable d = new DepositRunnable(account, AMOUNT, REPETITIONS);
            WithdrawRunnable w = new WithdrawRunnable(account, AMOUNT, REPETITIONS);

            new Thread(d).start();
            new Thread(d).start();
            new Thread(w).start();
        }
    }
}
