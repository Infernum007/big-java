package p_18_03_pair_min_max_generic_comparable;

/**
 * A savings account has a balance that can be changed by
 * adding percent on deposit.
 */
public class SavingsAccount extends BankAccount
{
    public SavingsAccount(final double balance)
    {
        super(balance);
    }

    @Override
    public String toString()
    {
        return SavingsAccount.class.getSimpleName() + "[" + "balance=" + super.getBalance() + "]";
    }
}
