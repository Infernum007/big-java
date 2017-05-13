package p_18_01_pair_min_max_measurable;

/**
 * Modify the {@code Coin} class from Chapter 8 to have it implement
 * the {@code Comparable} interface.
 */
public class Coin implements Measurable
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
    public double getMeasure()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return "Coin[" + "value=" + value + ",name=" + name + "]";
    }
}
