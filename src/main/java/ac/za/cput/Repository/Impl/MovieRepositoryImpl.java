package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Repository.MovieRepository;

import java.util.HashSet;
import java.util.Set;

public class MovieRepositoryImpl implements MovieRepository {

    private static MovieRepositoryImpl repository = null;
    private Set<Movie> movie = new HashSet<>();

    public static MovieRepositoryImpl getRepository()
    {
        if (repository == null) repository = new MovieRepositoryImpl();
        return repository;
    }

    public Movie create (Movie movie)
    {
        this.movie.add(movie);
        return movie;
    }

    public Movie read (String movie)
    {
        return null;
    }

    public Movie update (Movie movie)
    {
        return null;
    }

    public void delete(String movie)
    {

    }

    public Set<Movie> getAll()
    {
        final Set<Movie> movie = this.movie;
        return movie;
    }
}
