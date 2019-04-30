package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.CustomerRental;
import ac.za.cput.Repository.CustRentalRepository;

import java.util.HashSet;
import java.util.Set;

public class CustRentalRepositoryImpl implements CustRentalRepository {

    private static CustRentalRepositoryImpl repository = null;
    private Set<CustomerRental> customerRental = new HashSet<>();

    static CustRentalRepositoryImpl getRepository()
    {
        if(repository == null) repository = new CustRentalRepositoryImpl();
        return repository;
    }

    public CustomerRental create (CustomerRental customerRental)
    {
        this.customerRental.add(customerRental);
        return customerRental;
    }

    public CustomerRental read (CustomerRental customerRental)
    {
        return null;
    }

    public CustomerRental update (CustomerRental customerRental)
    {
        return null;
    }

    public void delete(String customerRental)
    {

    }

    public Set<CustomerRental> getAll()
    {
        final Set<CustomerRental> customerRental = this.customerRental;
        return customerRental;
    }
}
