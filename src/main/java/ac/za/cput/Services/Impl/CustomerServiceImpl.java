package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Customer.Customer;
import ac.za.cput.Repository.CustomerRespository;
import ac.za.cput.Repository.Impl.CustomerRepositoryImpl;
import ac.za.cput.Services.Customer.CustomerService;

import java.util.Set;

public class CustomerServiceImpl implements CustomerService {

    private static CustomerServiceImpl service = null;
    private CustomerRespository repository;

    private CustomerServiceImpl()
    {
        this.repository = CustomerRepositoryImpl.getRepository();
    }

    public static CustomerServiceImpl getService(){
        if (service == null) service = new CustomerServiceImpl();
        return service;
    }

    @Override
    public Customer create(Customer type) {
        return this.repository.create(type);

    }

    @Override
    public Customer update(Customer type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Customer read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Customer> getAll() {
        return this.repository.getAll();
    }
}
