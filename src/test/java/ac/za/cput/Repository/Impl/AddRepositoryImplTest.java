package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Customer.AddMember;
import ac.za.cput.Repository.AddRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class AddRepositoryImplTest {

    private AddRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = AddRepositoryImpl.getRepository();
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
    public void getAll() {
        Set<AddMember> addMember = this.repository.getAll();
        Assert.assertEquals(1, addMember.size());
    }
}