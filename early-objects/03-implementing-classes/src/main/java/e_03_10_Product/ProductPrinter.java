package e_03_10_Product;

/**
 * Implement a class {@code Product}. A product has a name and a price, for
 * example {@code new Product("Toaster", 29.95)}. Supply methods {@code
 * getName}, {@code getPrice}, and {@code reducePrice}. Supply a program
 * {@code ProductPrinter} that makes two products, prints the name and price,
 * reduces their prices by $5.00, and then prints the prices again.
 */
public class ProductPrinter
{
    public static void main(String[] args)
    {
        Product lollipop = new Product("Lollipop", 7.45);
        Product marshmallow = new Product("Marshmallow", 10.10);

        System.out.println(lollipop.getName() + " price: $"
                + lollipop.getPrice());
        lollipop.reducePrice(5);

        System.out.println(marshmallow.getName() + " price: $"
                + marshmallow.getPrice());
        marshmallow.reducePrice(5);

        System.out.println(lollipop.getName() + " reduced price: $"
                + lollipop.getPrice());
        System.out.println(marshmallow.getName() + " reduced price: $" +
                marshmallow.getPrice());
    }
}
