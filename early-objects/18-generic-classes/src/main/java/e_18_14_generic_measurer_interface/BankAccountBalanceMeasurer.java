package e_18_14_generic_measurer_interface;

/**
 * {@code BankAccountBalanceMeasurer} class.
 */
public class BankAccountBalanceMeasurer implements Measurer<BankAccount>
{
    @Override
    public double measure(final BankAccount anObject)
    {
        return anObject.getBalance();
    }
}
