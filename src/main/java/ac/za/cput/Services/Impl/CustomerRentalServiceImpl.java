package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Movie.CustRental;
import ac.za.cput.Repository.CustRentalRepository;
import ac.za.cput.Repository.Impl.CustRentalRepositoryImpl;
import ac.za.cput.Services.Movie.CustomerRentalService;

import java.util.Set;

public class CustomerRentalServiceImpl implements CustomerRentalService {

    private static CustomerRentalServiceImpl service = null;
    private CustRentalRepository repository;

    private CustomerRentalServiceImpl()
    {
        this.repository = CustRentalRepositoryImpl.getRepository();
    }

    public static CustomerRentalServiceImpl getService(){
        if (service == null) service = new CustomerRentalServiceImpl();
        return service;
    }

    @Override
    public CustRental create(CustRental type) {
        return this.repository.create(type);

    }

    @Override
    public CustRental update(CustRental type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public CustRental read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<CustRental> getAll() {
        return this.repository.getAll();

    }
}
