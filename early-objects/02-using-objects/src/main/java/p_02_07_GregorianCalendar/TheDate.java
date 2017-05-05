package p_02_07_GregorianCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * The {@code GregorianCalendar} class describes a point in time, as measured
 * by the Gregorian calendar, the standard calendar that is commonly used
 * throughout the world today. You construct a {@code GregorianCalendar} object
 * from a year, month, and day of the month, like this:
 * <p><pre>
 *      GregorianCalendar cal = new GregorianCalendar(); // Today's date
 *      GregorianCalendar eckertsBirthday = new GregorianCalendar(1919, Calendar.APRIL, 9);</pre>
 * Use the values {@code Calendar.JANUARY . . . Calendar.DECEMBER} to specify
 * the month. The {@code add} method can be used to add a number of days to a
 * {@code GregorianCalendar} object:
 * <p><pre>
 *      cal.add(Calendar.DAY_OF_MONTH, 10); // Now cal is ten days from today</pre>
 * This is a mutator method &mdash; it changes the cal object. The {@code get}
 * method can be used to query a given {@code GregorianCalendar} object:
 * <p><pre>
 *      int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
 *      int month = cal.get(Calendar.MONTH);
 *      int year = cal.get(Calendar.YEAR);
 *      int weekday = cal.get(Calendar.DAY_OF_WEEK);
 *          // 1 is Sunday, 2 is Monday, . . . , 7 is Saturday</pre>
 * Your task is to write a program that prints:
 * <p><ul>
 * <li>The date and weekday that is 100 days from today.
 * <li>The weekday of your birthday.
 * <li>The date that is 10,000 days from your birthday.</ul>
 * <p>
 * Use the birthday of a computer scientist if you don't want to reveal your own
 * birthday. Hint: The {@code GregorianCalendar} class is complex, and it is a
 * really good idea to write a few test programs to explore the API before
 * tackling the whole problem. Start with a program that constructs today's
 * date, adds ten days, and prints out the day of the month and the weekday.
 */
public class TheDate
{
    public static void main(String[] args)
    {
        GregorianCalendar today = new GregorianCalendar();

        // The day and weekday that is 100 from today
        today.add(Calendar.DAY_OF_MONTH, 100);
        int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        int weekDay = today.get(Calendar.DAY_OF_WEEK);
        System.out.print("The date and weekday that is 100 days from today: " + dayOfMonth + ", " + weekDay);
        System.out.println();

        // The weekday of Euler birthday
        GregorianCalendar eulerBirthDay = new GregorianCalendar(1707, 3, 15);
        int birthDayWeekDay = eulerBirthDay.get(Calendar.DAY_OF_WEEK);
        System.out.println("The weekday of Euler birthday: " + birthDayWeekDay);

        // The date that is 10,000 days from Euler's birthday
        eulerBirthDay.add(Calendar.DAY_OF_MONTH, 10000);
        int day = eulerBirthDay.get(Calendar.DAY_OF_MONTH);
        int month = eulerBirthDay.get(Calendar.MONTH);
        int year = eulerBirthDay.get(Calendar.YEAR);
        System.out.print("10,000 days from Euler's Birth Date: ");
        System.out.println(year + "-" + month + "-" + day);
    }
}
