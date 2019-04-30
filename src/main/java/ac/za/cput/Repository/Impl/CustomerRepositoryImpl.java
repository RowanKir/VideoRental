package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Customer.Customer;
import ac.za.cput.Repository.CustomerRespository;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepositoryImpl implements CustomerRespository {

    private static CustomerRepositoryImpl repository = null;
    private Set<Customer> cust = new HashSet<>();

    static CustomerRepositoryImpl getRepository()
    {
        if(repository == null) repository = new CustomerRepositoryImpl();
        return repository;
    }

    public Customer create (Customer cust)
    {
        this.cust.add(cust);
        return cust;
    }

    public Customer read (Customer cust)
    {
        return null;
    }

    public Customer update (Customer cust)
    {
        return null;
    }

    public void delete(String cust)
    {

    }

    public Set<Customer> getAll()
    {
        final Set<Customer> condition = this.cust;
        return cust;
    }
}
