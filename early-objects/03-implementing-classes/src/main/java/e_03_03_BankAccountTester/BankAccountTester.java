package e_03_03_BankAccountTester;

/**
 * Write a {@code BankAccountTester} class whose {@code main} method constructs
 * a bank account, deposits $1,000, withdraws $500, withdraws another $400,
 * and then prints the remaining balance. Also print the expected result.
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(400);

        System.out.print("Current balance: ");
        System.out.println(account.getBalance());

        System.out.println("Expected balance: 100");
    }
}
