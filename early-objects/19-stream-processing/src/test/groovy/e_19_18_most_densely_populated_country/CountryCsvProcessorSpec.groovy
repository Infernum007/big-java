package e_19_18_most_densely_populated_country

import spock.lang.Specification

class CountryCsvProcessorSpec extends Specification {

    CountryCsvProcessor csvProcessor

    void setup() {
        csvProcessor = CountryCsvProcessor.instance
        assert csvProcessor != null
    }

    def "getFile method returns csv file from resources folder"() {
        expect:
        csvProcessor.csvFile.name == "population_density.csv"
    }

    def "getCsvData collects data from csv file to a list"() {
        setup:
        List<Country> countries = csvProcessor.countries

        expect:
        countries[0] == new Country("Afghanistan", 29835392, 250000 as double)
        countries[countries.size() - 1] == new Country("Zimbabwe", 12084304, 150803 as double)
        countries.contains(new Country("Vatican City", 832, 0.17 as double))
    }
}
