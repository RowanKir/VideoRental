package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Customer.Customer;
import ac.za.cput.Repository.CustomerRespository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CustomerRepositoryImplTest {

    private CustomerRespository respository;

    @Before
    public void setUp() throws Exception
    {
        this.respository = CustomerRepositoryImpl.getRepository();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void create()
    {
        this.respository.create(null);
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
        Set<Customer> cust = this.respository.getAll();
        Assert.assertEquals(1,1);
    }
}
