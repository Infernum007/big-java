package p_03_07_RoachPopulation;

/**
 * Implement a class {@code RoachPopulation} that simulates the growth of a
 * roach population. The constructor takes the size of the initial roach
 * population. The breed method simulates a period in which the roaches breed,
 * which doubles their population. The {@code spray(double percent)} method
 * simulates spraying with insecticide, which reduces the population by the
 * given percentage. The {@code getRoaches} method returns the current number
 * of roaches. A program called {@code RoachSimulation} simulates a population
 * that starts out with 10 roaches. Breed, spray to reduce the population by
 * 10 percent, and print the roach count. Repeat three more times.
 */
public class RoachSimulation
{
    public static void main(String[] args)
    {
        RoachPopulation roaches = new RoachPopulation(10);

        System.out.print("Roaches: ");
        System.out.println(roaches.getRoaches());

        roaches.spray(10);
        System.out.print("Roaches: ");
        System.out.println(roaches.getRoaches());

        roaches.breed();
        roaches.spray(10);
        System.out.print("Roaches: ");
        System.out.println(roaches.getRoaches());

        roaches.breed();
        roaches.spray(10);
        System.out.print("Roaches: ");
        System.out.println(roaches.getRoaches());
    }
}
