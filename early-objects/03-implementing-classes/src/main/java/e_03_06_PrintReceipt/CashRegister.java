package e_03_06_PrintReceipt;

/**
 * Add a method {@code printReceipt} to the {@code CashRegister} class. The
 * method should print the prices of all purchased items and the total amount
 * due. Hint: You will need to form a string of all prices. Use the {@code
 * concat} method of the {@code String} class to add additional items to that
 * string. To turn a price into a string, use the call {@code
 * String.valueOf(price)}.
 */
public class CashRegister
{
    private double taxRate;
    private double purchase;
    private double taxablePurchase;
    private double payment;
    private String receipt;

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
}
