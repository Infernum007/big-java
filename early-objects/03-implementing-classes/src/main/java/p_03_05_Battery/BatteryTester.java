package p_03_05_Battery;

/**
 * A class to test the {@code Battery} class.
 */
public class BatteryTester
{
    public static void main(String[] args)
    {
        Battery battery = new Battery(80);

        System.out.print("Current capacity: ");
        System.out.println(battery.getRemainingCapacity());

        battery.drain(79); // sets current capacity to 1
        battery.charge(); // set the capacity to its original capacity

        System.out.print("Current capacity: ");
        System.out.println(battery.getRemainingCapacity());
    }
}
