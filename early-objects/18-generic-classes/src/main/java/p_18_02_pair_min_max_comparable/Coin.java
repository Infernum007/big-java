package p_18_02_pair_min_max_comparable;

/**
 * Modify the {@code Coin} class from Chapter 8 to have it implement
 * the {@code Comparable} interface.
 */
public class Coin implements Comparable
{
    private double value;
    private String name;

    /**
     * Constructs a coin object.
     *
     * @param aValue the value
     * @param aName  the name
     */
    public Coin(double aValue, String aName)
    {
        value = aValue;
        name = aName;
    }

    /**
     * Gets the value of this coin.
     *
     * @return the value
     */
    public double getValue()
    {
        return value;
    }

    /**
     * Gets the name of the coin.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Coin[" + "value=" + value + ",name=" + name + "]";
    }

    @Override
    public int compareTo(final Object obj)
    {
        Coin coin = (Coin) obj;
        return Double.compare(this.value, coin.value);
    }
}
