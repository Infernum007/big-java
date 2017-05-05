package p_03_09_enhanceBankAccount;

/**
 * Demo of the {@code BankAccount} class.
 */
public class BankAccountDemo
{
    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount(1000);

        bankAccount.deposit(100, 10);
        System.out.print("The balance after deposit: ");
        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(100, 10);
        System.out.print("The balance after deposit: ");
        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(100, 10);
        System.out.print("The balance after deposit: ");
        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(100, 10);
        System.out.print("The balance after deposit: ");
        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(100, 10);
        System.out.print("The balance after deposit: ");
        System.out.println(bankAccount.getBalance());

        bankAccount.withdraw(100, 10);
        System.out.print("The balance after withdrawal: ");
        System.out.println(bankAccount.getBalance());

        bankAccount.deductMonthlyCharge(3, 10);
        System.out.print("The balance after deducting monthly charge: ");
        System.out.println(bankAccount.getBalance());
    }
}
