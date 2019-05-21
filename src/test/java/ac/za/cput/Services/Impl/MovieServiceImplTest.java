package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Factory.Movie.MovieFactory;
import ac.za.cput.Repository.Impl.MovieRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class MovieServiceImplTest {

    private MovieRepositoryImpl repository;
    private Movie movie;

    private Movie getSaved()
    {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = MovieRepositoryImpl.getRepository();
        this.movie = MovieFactory.buildMovie("1", 1, 1);
    }

    @Test
    public void a_create()
    {
        Movie created = this.repository.create(this.movie);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.movie);
    }

    @Test
    public void c_update()
    {
        String newCourseName = "Application Development Theory 3";
        Movie updated = new Movie.Builder().copy(getSaved()).movieTitle(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getMovieTitle());
    }

    @Test
    public void e_delete()
    {
        Movie saved = getSaved();
        this.repository.delete(saved.getMovieId());
        d_getAll();
    }

    @Test
    public void b_read()
    {
        Movie saved = getSaved();
        Movie read = this.repository.read(saved.getMovieId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll()
    {
        Set<Movie> courses = this.repository.getAll();
        System.out.println("In getall, all = " + courses);
    }
}