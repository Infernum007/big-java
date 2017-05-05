package e_03_06_PrintReceipt;

/**
 * A class to test the CashRegister class.
 */
public class CashRegisterTester
{
    public static void main(String[] args)
    {
        CashRegister register = new CashRegister(5);

        register.recordPurchase(29.50);
        register.recordPurchase(9.25);
        register.recordPurchase(3.28);
        register.receivePayment(50);

        String receipt = register.printReceipt();

        System.out.println(receipt);

    }
}
