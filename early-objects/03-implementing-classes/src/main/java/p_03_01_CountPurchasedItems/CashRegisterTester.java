package p_03_01_CountPurchasedItems;

/**
 * A class to test the {@code CashRegister} class.
 */
public class CashRegisterTester
{
    public static void main(String[] args)
    {
        CashRegister register = new CashRegister(5);

        register.recordPurchase(29.50);
        register.recordPurchase(9.25);
        register.receivePayment(50);

        int count = register.getCountItems();

        System.out.println(count);
        System.out.println("Expected: 2");
    }
}
