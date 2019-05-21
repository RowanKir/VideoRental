package ac.za.cput.Services.Customer;

import ac.za.cput.Domain.Customer.Customer;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface CustomerService extends IService <Customer, String>
{
    Set<Customer> getAll();
}
