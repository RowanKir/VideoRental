package ac.za.cput.Repository.Impl;

import ac.za.cput.Repository.CastRepository;
import org.junit.Before;
import org.junit.Test;

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