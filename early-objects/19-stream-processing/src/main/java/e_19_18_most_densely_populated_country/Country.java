package e_19_18_most_densely_populated_country;

import java.util.Objects;

public class Country
{
    private String name;
    private long population;
    private double area;

    public Country(final String name, final long population, final double area)
    {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public String getName()
    {
        return name;
    }

    public long getPopulation()
    {
        return population;
    }

    public double getArea()
    {
        return area;
    }

    @Override
    public boolean equals(final Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Country country = (Country) o;
        return population == country.population &&
                area == country.area &&
                Objects.equals(name, country.name);
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(name, population, area);
    }

    @Override
    public String toString()
    {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }
}
