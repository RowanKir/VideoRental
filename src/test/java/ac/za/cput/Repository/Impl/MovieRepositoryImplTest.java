package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Factory.Movie.MovieFactory;
import ac.za.cput.Repository.MovieRepository;
import org.junit.After;
import org.junit.Assert;
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
        this.movie = MovieFactory.buildMovie("1",1 , 1);
    }


    @Test
    public void a_create()
    {
        Movie created = this.repository.create(this.movie);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.movie);
    }

    @Test
    public void b_read()
    {
        Movie savedMovie = getSavedMovie();
        System.out.println("In read, courseId = "+ savedMovie.getMovieId());
        Movie read = this.repository.read(savedMovie.getMovieId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedMovie, read);
    }

    @Test
    public void c_update()
    {
        String newname = "New Test Course Name";
        Movie account = new Movie.Builder().copy(getSavedMovie()).movieTitle(newname).build();
        System.out.println("In update, about_to_updated = " + account);
        Movie updated = this.repository.update(account);
        System.out.println("In update, updated = " + updated);
        assertSame(newname, updated.getMovieTitle());
        d_getAll();
    }

    @Test
    public void e_delete()
    {
        Movie savedMovie = getSavedMovie();
        this.repository.delete(savedMovie.getMovieId());
        d_getAll();
    }

    @Test
    public void d_getAll()
    {
        Set<Movie> accounts =  this.repository.getAll();
        System.out.println("In getAll, all = " + accounts);
    }
}