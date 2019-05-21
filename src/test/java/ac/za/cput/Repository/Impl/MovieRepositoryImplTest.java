package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Factory.Movie.MovieFactory;
import ac.za.cput.Repository.MovieRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class MovieRepositoryImplTest {

    private MovieRepository repository;
    private Movie movie;

    private Movie getSavedMovie()
    {
        Set<Movie> savedMovie = this.repository.getAll();
        return savedMovie.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = MovieRepositoryImpl.getRepository();
        //this.movie = MovieFactory.buildMovie(null, null);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void create() {
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {

    }
}