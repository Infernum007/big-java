package e_19_18_most_densely_populated_country;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Write a program that reads a {@code Stream&lt;Country&gt;} from a file that
 * contains country names and numbers for the population and area. Print the
 * most densely populated country.
 */
public class CountryDataAnalyser
{
    private List<Country> countries;

    public CountryDataAnalyser() throws IOException
    {
        countries = getCountriesList();
    }

    public Optional<Country> getMostDenselyPopulatedCountry()
    {
        try (Stream<Country> countryStream = countries.stream()) {
            return countryStream
                    .max(Comparator.comparing(c -> c.getPopulation() / c.getArea()));
        }
    }

    private List<Country> getCountriesList() throws IOException
    {
        return CountryCsvProcessor.getInstance().getCountries();
    }
}
