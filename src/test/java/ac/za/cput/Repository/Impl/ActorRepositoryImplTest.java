package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.Actor;
import ac.za.cput.Repository.ActorRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ActorRepositoryImplTest {

    private ActorRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = ActorRepositoryImpl.getRepository();
    }

    @Test
    public void create()
    {
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
        Set<Actor> actor = this.repository.getAll();
        Assert.assertEquals(1, actor.size());
    }
}