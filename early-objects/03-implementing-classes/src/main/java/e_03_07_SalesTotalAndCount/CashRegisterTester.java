package e_03_07_SalesTotalAndCount;

/**
 * After closing time, the store manager would like to know how much business
 * was transacted during the day. Modify the {@code CashRegister} class to
 * enable this functionality. Supply methods {@code getSalesTotal} and
 * {@code getSalesCount} to get the total amount of all sales and the number of
 * sales. Supply a method {@code reset} that resets any counters and totals so
 * that the next day’s sales start from zero.
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

        System.out.print("Total sales: $");
        System.out.println(register.getSalesTotal());

        System.out.print("Sales count: ");
        System.out.println(register.getSalesCount());
    }
}
