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
class RoachPopulation
{
    private int roaches;

    /**
     * Constructs roaches population with initial number parameter.
     *
     * @param initial the initial number of roaches
     */
    RoachPopulation(int initial)
    {
        roaches = initial;
    }

    /**
     * Doubles population of roaches.
     */
    void breed()
    {
        roaches *= 2;
    }

    /**
     * Reduces number of roaches by the given percent.
     *
     * @param percent the number of roaches to reduce
     */
    void spray(double percent)
    {
        roaches = (int) (roaches - (roaches * percent / 100));
    }

    /**
     * Gets the current number of roaches.
     *
     * @return the number of roaches
     */
    int getRoaches()
    {
        return roaches;
    }
}
