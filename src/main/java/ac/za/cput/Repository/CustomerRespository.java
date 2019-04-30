package ac.za.cput.Repository;

import ac.za.cput.Domain.Customer.Customer;

import java.util.Set;

public interface CustomerRespository extends IRepository<Customer, String>{
    Set<Customer> getAll();
}
