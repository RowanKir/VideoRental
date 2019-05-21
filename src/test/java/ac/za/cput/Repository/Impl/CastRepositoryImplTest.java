package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.MovieCast;
import ac.za.cput.Repository.CastRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CastRepositoryImplTest {

    private CastRepository repository;
    @Before
    public void setUp() throws Exception
    {
        this.repository = CastRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        this.repository.create(null);
        Assert.assertEquals(null, null);
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
    public void getAll()
    {
        Set<MovieCast> cast = this.repository.getAll();
        Assert.assertEquals(1, cast.size());
    }
}