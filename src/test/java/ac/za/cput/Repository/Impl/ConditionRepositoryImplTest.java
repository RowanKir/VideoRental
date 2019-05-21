package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.Condition;
import ac.za.cput.Repository.ConditionRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ConditionRepositoryImplTest {

    private ConditionRepository repository;
    private Condition condition;


    @Before
    public void setUp() throws Exception
    {
        this.repository = ConditionRepositoryImpl.getRepository();
    }

    @After
    public void tearDown() throws Exception {
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
        Set<Condition> condition = this.repository.getAll();
        Assert.assertEquals(1,condition.size());
    }
}