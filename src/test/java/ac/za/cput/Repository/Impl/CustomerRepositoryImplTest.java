package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Customer.Customer;
import ac.za.cput.Factory.Customer.CustomerFactory;
import ac.za.cput.Repository.CustomerRespository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CustomerRepositoryImplTest {

    private CustomerRespository respository;
    private Customer cust;

    private Customer getSavedCustomer()
    {
        Set<Customer> savedCustomer = this.respository.getAll();
        return savedCustomer.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.respository = CustomerRepositoryImpl.getRepository();
        this.cust = CustomerFactory.buildCustomer("1", "0826130320","Rowan","Kirchner","rowankirchner@gmail.com","1 Gore street; Cape Town",true);
    }


    @Test
    public void a_create()
    {
        Customer created = this.respository.create(this.cust);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.cust);
    }

    @Test
    public void b_read()
    {
        Customer savedCustomer = getSavedCustomer();
        System.out.println("In read, courseId = "+ savedCustomer.getCustId());
        Customer read = this.respository.read(savedCustomer.getCustId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedCustomer, read);
    }

    @Test
    public void c_update()
    {
        String newname = "New Test Course Name";
        Customer account = new Customer.Builder().copy(getSavedCustomer()).custName(newname).build();
        System.out.println("In update, about_to_updated = " + account);
        Customer updated = this.respository.update(cust);
        System.out.println("In update, updated = " + updated);
        assertSame(newname, updated.getCustName());
        d_getAll();
    }

    @Test
    public void e_delete() {
        Customer savedCustomer = getSavedCustomer();
        this.respository.delete(savedCustomer.getCustId());
        d_getAll();
    }

    @Test
    public void d_getAll()
    {
        Set<Customer> cust = this.respository.getAll();
        System.out.println("In getAll, all = " + cust);
        //Assert.assertEquals(1,1);
    }
}
