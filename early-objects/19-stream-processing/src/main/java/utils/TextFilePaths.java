package utils;

/**
 * {@code FilePaths} class.
 */
public enum TextFilePaths
{
    ALICE("early-objects/19-stream-processing/src/main/resources/alice30.txt"),
    COUNTRIES("early-objects/19-stream-processing/src/main/resources/countries.txt"),
    POPULATION("early-objects/19-stream-processing/src/main/resources/population.txt"),
    WaP("early-objects/19-stream-processing/src/main/resources/war-and-peace.txt"),
    WORDS("early-objects/19-stream-processing/src/main/resources/words.txt");

    private final String path;

    TextFilePaths(final String s)
    {
        this.path = s;
    }

    @Override
    public String toString()
    {
        return this.path;
    }
}
