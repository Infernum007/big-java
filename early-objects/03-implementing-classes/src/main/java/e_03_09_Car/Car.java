package e_03_09_Car;

/**
 * Implement a class {@code Car} with the following properties. A car has a
 * certain fuel efficiency (measured in miles/gallon or liters/km - pick one)
 * and a certain amount of fuel in the gas tank. The efficiency is specified in
 * the constructor, and the initial fuel level is 0. Supply a method {@code
 * drive} that simulates driving the car for a certain distance, reducing the
 * amount of gasoline in the fuel tank. Also supply methods {@code
 * getGasInTank}, returning the current amount of gasoline in the fuel tank,
 * and {@code addGas}, to add gasoline to the fuel tank. Sample usage:
 * <p><pre>
 *      Car myHybrid = new Car(50); // 50 miles per gallon
 *      myHybrid.addGas(20); // Tank 20 gallons
 *      myHybrid.drive(100); // Drive 100 miles
 *      double gasLeft = myHybrid.getGasInTank(); // Gas remaining in tank</pre>
 * You may assume that the {@code drive} method is never called with a distance
 * that consumes more than the available gas. Supply a {@code CarTester} class
 * that tests all methods.
 */
public class Car
{
    private double fuel;
    private double efficiency;

    /**
     * Constructs a car with a certain fuel efficiency - liters per 100 km.
     *
     * @param anEfficiency the fuel efficiency (liters/100km)
     */
    public Car(double anEfficiency)
    {
        fuel = 0;
        efficiency = anEfficiency / 100;
    }

    /**
     * Adds a certain amount of gas in the fuel tank.
     *
     * @param gas amount of gas
     */
    void addGas(double gas)
    {
        fuel = gas;
    }

    /**
     * Drives a car to a given distance and reduces the amount
     * of fuel in the tank according to car's fuel efficiency.
     *
     * @param km kilometers to drive
     */
    void drive(double km)
    {
        fuel = fuel - (efficiency * km);
    }

    /**
     * Gets amount of gas in the tank.
     *
     * @return fuel in the tank
     */
    double getGasInTank()
    {
        return fuel;
    }
}
