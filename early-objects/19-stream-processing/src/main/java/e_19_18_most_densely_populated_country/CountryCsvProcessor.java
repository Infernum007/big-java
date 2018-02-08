package e_19_18_most_densely_populated_country;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code CountryCsvProcessor} class to process list of countries in csv format.
 */
public class CountryCsvProcessor
{
    private final static String CSV_FILE = "population_density.csv";
    private final static CountryCsvProcessor INSTANCE = new CountryCsvProcessor();

    /**
     * Creates an empty list of countries and initialises csv data processor.
     *
     * @throws IOException
     */
    private CountryCsvProcessor() {}

    /**
     * Static factory to implement singleton {@code CountryCsvProcessor}.
     *
     * @return a single instance of {@code CountryCsvProcessor}
     */
    public static CountryCsvProcessor getInstance()
    {
        return INSTANCE;
    }

    /**
     * Extracts data from csv file and adds it to the list of countries.
     *
     * @throws IOException
     */
    private List<Country> getCsvData() throws IOException
    {
        List<Country> countries = new ArrayList<>();
        final File csvFile = getCsvFile();
        final CSVReader csvReader = new CSVReader(new FileReader(csvFile.getPath()));

        String[] nextLine;
        while ((nextLine = csvReader.readNext()) != null) {
            countries.add(new Country(nextLine[0], Long.parseLong(nextLine[1]), Double.parseDouble(nextLine[2])));
        }
        return countries;
    }

    /**
     * Gets the csv file with countries names, population and density.
     *
     * @return csv file specified in class constant
     */
    public File getCsvFile()
    {
        final ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        return new File(Objects.requireNonNull(classLoader.getResource(CSV_FILE)).getFile());
    }

    /**
     * Gets the list of countries with each containing
     * country name, population and density.
     *
     * @return list of countries
     */
    public List<Country> getCountries() throws IOException
    {
        return getCsvData();
    }
}
