package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Movie.Rental;
import ac.za.cput.Repository.Impl.RentalRepositoryImpl;
import ac.za.cput.Repository.RentalRepository;
import ac.za.cput.Services.Movie.RentalService;

import java.util.Set;

public class RentalServiceImpl implements RentalService {

    private static RentalServiceImpl service = null;
    private RentalRepository repository;

    private RentalServiceImpl()
    {
        this.repository = RentalRepositoryImpl.getRepository();
    }

    public static RentalServiceImpl getService(){
        if (service == null) service = new RentalServiceImpl();
        return service;
    }

    @Override
    public Rental create(Rental type) {
        return this.repository.create(type);
    }

    @Override
    public Rental update(Rental type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Rental read(String s) {
        return this.repository.read(s);

    }

    @Override
    public Set<Rental> getAll() {
        return this.repository.getAll();
    }

}
