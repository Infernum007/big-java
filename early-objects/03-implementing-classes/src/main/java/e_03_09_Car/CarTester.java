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
public class CarTester
{
    public static void main(String[] args)
    {
        Car myCar = new Car(11.8);

        myCar.addGas(20);

        myCar.drive(20);

        System.out.println("Gas in tank: " + myCar.getGasInTank());
    }
}
