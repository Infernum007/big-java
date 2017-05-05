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
public class SavingsAccountTester
{
    public static void main(String[] args)
    {
        SavingsAccount sAccount = new SavingsAccount(1000);

        sAccount.addInterest();

        System.out.printf("Current balance: $%,.2f%n", sAccount.getBalance());

        System.out.println("Expected balance: $1,100.00");
    }
}
