package e_18_14_generic_measurer_interface;

/**
 * {@code BankAccountBalanceMeasurer} class.
 */
public class BankAccountBalanceMeasurer<T extends BankAccount> implements Measurer<T>
{
    @Override
    public double measure(final T anObject)
    {
        return anObject.getBalance();
    }
}
