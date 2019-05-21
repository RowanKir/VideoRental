package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.MovieCast;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieCastFactoryTest {

    private String castTest;

    @Before
    public void setUp() throws Exception
    {
        this.castTest = "castTest";
    }

    @Test
    public void buildCast()
    {
        MovieCast cast = MovieCastFactory.buildMovieCast(1, 2);
        Assert.assertNotNull(cast.getMovieId());
        Assert.assertNotNull(cast);
    }
}