package p_02_06_February28;

/**
 * Using the Day class of Worked Example 1, write a program that generates a
 * {@code Day} object representing February 28 of this year, and three more such
 * objects that represent February 28 of the next three years. Advance each
 * object by one day, and print each object. Also print the expected values:
 * <p><pre>
 *      2012-02-29
 *      Expected: 2012-02-29
 *      2013-03-01
 *      Expected: 2013-03-01
 *      . . .</pre>
 */
public class February28
{
    public static void main(String[] args)
    {
        Day feb2016 = new Day(2016, 2, 28);
        Day feb2017 = new Day(2017, 2, 28);
        Day feb2018 = new Day(2018, 2, 28);

        System.out.println(feb2016.toString());
        System.out.println("Expected: 2016-02-28");
        System.out.println(feb2016.addDays(1).toString());
        System.out.println("Expected: 2016-02-29");
        System.out.println(feb2016.addDays(2).toString());
        System.out.println("Expected: 2016-03-01" + "\n");

        System.out.println(feb2017.toString());
        System.out.println("Expected: 2017-02-28");
        System.out.println(feb2017.addDays(1).toString());
        System.out.println("Expected: 2017-03-01");
        System.out.println(feb2017.addDays(2).toString());
        System.out.println("Expected: 2017-03-02" + "\n");

        System.out.println(feb2018.toString());
        System.out.println("Expected: 2018-02-28");
        System.out.println(feb2018.addDays(1).toString());
        System.out.println("Expected: 2018-03-01");
        System.out.println(feb2018.addDays(2).toString());
        System.out.println("Expected: 2018-03-02");
    }
}
