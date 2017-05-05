package e_03_07_SalesTotalAndCount;

/**
 * After closing time, the store manager would like to know how much business
 * was transacted during the day. Modify the {@code CashRegister} class to
 * enable this functionality. Supply methods {@code getSalesTotal} and
 * {@code getSalesCount} to get the total amount of all sales and the number of
 * sales. Supply a method {@code reset} that resets any counters and totals so
 * that the next day’s sales start from zero.
 */
public class CashRegister
{
    private double taxRate;
    private double purchase;
    private double taxablePurchase;
    private double payment;
    private String receipt;
    private int salesCount;

    /**
     * Constructs a cash register with no money in it.
     *
     * @param rate the tax rate for taxable purchases
     */
    public CashRegister(double rate)
    {
        taxRate = rate;
        purchase = 0;
        payment = 0;
        receipt = "";
        salesCount = 0;
    }

    /**
     * Records the sale of a tax-free item.
     *
     * @param amount the price of the item
     */
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
        receipt = receipt.concat("$" + amount + "\n");
        salesCount++;
    }

    /**
     * Prints the prices for all purchased items and total amount of purchase.
     *
     * @return receipt, type of String
     */
    public String printReceipt()
    {
        return receipt + "Total: $" + purchase;
    }

    /**
     * Records the sale of a taxable item.
     *
     * @param amount the price of the item
     */
    public void recordTaxablePurchase(double amount)
    {
        taxablePurchase = taxablePurchase + amount;
    }

    /**
     * Processes a payment received from the customer.
     *
     * @param amount the amount of the payment
     */
    public void receivePayment(double amount)
    {
        payment = payment + amount;
    }

    /**
     * Processes the sales tax due.
     *
     * @return the sales tax due
     */
    public double getSalesTax()
    {
        return taxablePurchase * taxRate / 100;
    }

    /**
     * Computes the change due and resets the machine for the next customer.
     *
     * @return the change due to the customer
     */
    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    /**
     * Gets the total purchases.
     *
     * @return purchases total
     */
    public double getSalesTotal()
    {
        return purchase;
    }

    /**
     * Gets the total sales count.
     *
     * @return sales count
     */
    public int getSalesCount()
    {
        return salesCount;
    }

    /**
     * Resets counters and totals.
     */
    public void reset()
    {
        purchase = 0;
        salesCount = 0;
        payment = 0;
        receipt = "";
    }
}
