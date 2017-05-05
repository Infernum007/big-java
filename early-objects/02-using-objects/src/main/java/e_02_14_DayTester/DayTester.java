package e_02_14_DayTester;

/**
 * Using the {@code Day} class of Worked Example 2.1, write a {@code DayTester}
 * program that constructs a {@code Day} object representing today, adds ten
 * days to it, and then computes the difference between that day and today.
 * Print the difference and the expected value.
 */
public class DayTester
{
    public static void main(String[] args)
    {
        Day today = new Day();

        Day tenDays = today.addDays(10);

        System.out.print("Difference: ");
        System.out.println(tenDays.daysFrom(today));

        System.out.print("Expected: 10");
    }
}
