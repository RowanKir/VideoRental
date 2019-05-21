package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.Movie;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Assert;

import static org.junit.Assert.*;

public class MovieFactoryTest
{

    private String movieTest;

    @Before
    public void setUp() throws Exception
    {
        this.movieTest = "movieTest";
    }

    @After
    public void buildMovie()
    {
        Movie movie = MovieFactory.buildMovie("1", 1, 1);
        Assert.assertNotNull(movie.getConditionCode());
        Assert.assertNotNull(movie);
    }

}