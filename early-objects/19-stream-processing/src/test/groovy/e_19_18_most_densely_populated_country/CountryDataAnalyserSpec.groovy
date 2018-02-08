package e_19_18_most_densely_populated_country

import spock.lang.Specification

/**
 * {@code CountryDataAnalyserSpec} class.
 */
class CountryDataAnalyserSpec extends Specification {

    CountryDataAnalyser countryDataAnalyser

    void setup() {
        countryDataAnalyser = new CountryDataAnalyser()
        assert countryDataAnalyser != null
    }

    def "getMostDenselyPopulatedCountry returns correct result"() {
        expect:
        countryDataAnalyser.mostDenselyPopulatedCountry.get().name == 'Monaco'
    }
}
