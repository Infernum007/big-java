package p_19_11_actors_with_most_movies;

import java.util.List;

/**
 * {@code Movie} class.
 */
public class Movie
{
    private String title;
    private int year;
    private List<String> directors;
    private List<String> producers;
    private List<String> actors;

    public Movie(final String title, final int year, final List<String> directors,
                 final List<String> producers, final List<String> actors)
    {
        this.title = title;
        this.year = year;
        this.directors = directors;
        this.producers = producers;
        this.actors = actors;
    }

    public String getTitle()
    {
        return title;
    }

    public int getYear()
    {
        return year;
    }

    public List<String> getDirectors()
    {
        return directors;
    }

    public List<String> getProducers()
    {
        return producers;
    }

    public List<String> getActors()
    {
        return actors;
    }


}
