package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Customer.Customer;
import ac.za.cput.Factory.Customer.CustomerFactory;
import ac.za.cput.Repository.Impl.CustomerRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;


public class CustomerServiceImplTest {

    private CustomerRepositoryImpl repository;
    private Customer cust;

    private Customer getSaved()
    {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = CustomerRepositoryImpl.getRepository();
        this.cust = CustomerFactory.buildCustomer("1","04642641616","Rowan","Kirchner","rowajro@gmail.com","lasfm", true);
    }

    @Test
    public void a_create() {
        Customer created = this.repository.create(this.cust);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.cust);
    }

    @Test
    public void c_update() {
        String newCourseName = "Application Development Theory 3";
        Customer updated = new Customer.Builder().copy(getSaved()).custId(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getCustId());
    }

    @Test
    public void e_delete() {
        Customer saved = getSaved();
        this.repository.delete(saved.getCustId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Customer saved = getSaved();
        Customer read = this.repository.read(saved.getCustId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Customer> courses = this.repository.getAll();
        System.out.println("In getall, all = " + courses);
    }
}