package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.Rental;
import ac.za.cput.Repository.RentalRepository;

import java.util.HashSet;
import java.util.Set;

public class RentalRepositoryImpl implements RentalRepository {

    private static RentalRepositoryImpl repository = null;
    private Set<Rental> rental = new HashSet<>();

    static RentalRepositoryImpl getRepository()
    {
        if (repository == null) repository = new RentalRepositoryImpl();
        return repository;
    }

    public Rental create (Rental rental)
    {
        this.rental.add(rental);
        return rental;
    }

    public Rental read (String rental)
    {
        return null;
    }

    public Rental update (Rental rental)
    {
        return null;
    }

    public void delete(String rental)
    {

    }

    public Set<Rental> getAll()
    {
        final Set<Rental> rental = this.rental;
        return rental;
    }
}
