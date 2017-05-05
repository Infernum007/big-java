package e_03_10_Product;

/**
 * Implement a class {@code Product}. A product has a name and a price, for
 * example {@code new Product("Toaster", 29.95)}. Supply methods {@code
 * getName}, {@code getPrice}, and {@code reducePrice}. Supply a program
 * {@code ProductPrinter} that makes two products, prints the name and price,
 * reduces their prices by $5.00, and then prints the prices again.
 */
public class Product
{
    private String name;
    private double price;

    /**
     * Constructs a product with name and price provided as parameters.
     *
     * @param aName  the name of product
     * @param aPrice the price of product
     */
    Product(String aName, double aPrice)
    {
        name = aName;
        price = aPrice;
    }

    /**
     * Gets the name of the product.
     *
     * @return the name
     */
    String getName()
    {
        return name;
    }

    /**
     * Gets the price of the product.
     *
     * @return the price
     */
    double getPrice()
    {
        return price;
    }

    /**
     * Reduces the price of the product by certain amount supplied as parameter.
     *
     * @param reduceByAmount the amount to reduce the price
     */
    void reducePrice(double reduceByAmount)
    {
        price -= reduceByAmount;
    }
}
