package p_03_03_Balloon;

/**
 * A class to test the {@code Balloon} class.
 */
public class BalloonTester
{
    public static void main(String[] args)
    {
        Balloon balloon = new Balloon();

        balloon.inflate(5);
        balloon.inflate(2);

        String currentVolume = String.format("Current volume: %,.2f",
                balloon.getVolume());

        System.out.println(currentVolume);
    }
}
