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
public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount momSavings = new BankAccount(1000);

        momSavings.addInterest(10);

        System.out.printf("Current balance: $%,.2f%n", momSavings.getBalance());
        System.out.println("Expected balance: $1,100.00");
    }
}
