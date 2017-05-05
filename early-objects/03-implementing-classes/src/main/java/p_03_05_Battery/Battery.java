package p_03_05_Battery;

/**
 * Write a class {@code Battery} that models a rechargeable battery. A battery
 * has a constructor {@code public Battery(double capacity)} where capacity is
 * a value measured in milliampere hours. A typical AA battery has a capacity
 * of 2000 to 3000 mAh. The method
 * <p><pre>
 *      public void drain(double amount)</pre>
 * drains the capacity of the battery by the given amount. The method
 * <p><pre>
 *      public void charge()</pre>
 * charges the battery to its original capacity. The method
 * <p><pre>
 *      public double getRemainingCapacity()</pre>
 * gets the remaining capacity of the battery.
 */
public class Battery
{
    private double originalCapacity;
    private double currentCapacity;

    /**
     * Constructs a battery with capacity parameter
     *
     * @param capacity initial battery capacity
     */
    Battery(double capacity)
    {
        originalCapacity = capacity;
        currentCapacity = capacity;
    }

    /**
     * Drains the capacity of the battery by the given amount.
     *
     * @param amount the amount to drain capacity
     */
    void drain(double amount)
    {
        currentCapacity = Math.max(currentCapacity - amount, 0);
    }

    /**
     * Charges the battery to its original capacity.
     * Math.max(x, y) will return the greater value.
     */
    void charge()
    {
        currentCapacity = originalCapacity;
    }

    /**
     * Gets the remaining capacity of the battery.
     *
     * @return current capacity of the battery
     */
    double getRemainingCapacity()
    {
        return currentCapacity;
    }
}
