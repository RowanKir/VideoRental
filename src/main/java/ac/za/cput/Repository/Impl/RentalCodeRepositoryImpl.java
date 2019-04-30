package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.RentalCodeStatus;
import ac.za.cput.Repository.RentalCodeRepository;


import java.util.HashSet;
import java.util.Set;

public class RentalCodeRepositoryImpl implements RentalCodeRepository {

    private static RentalCodeRepositoryImpl repository = null;
    private Set<RentalCodeStatus> rentalCodeStatuses = new HashSet<>();

    static RentalCodeRepositoryImpl getRepository()
    {
        if(repository == null) repository = new RentalCodeRepositoryImpl();
        return repository;
    }

    public RentalCodeStatus create (RentalCodeStatus rentalCodeStatuses)
    {
        this.rentalCodeStatuses.add(rentalCodeStatuses);
        return rentalCodeStatuses;
    }

    public RentalCodeStatus read (RentalCodeStatus rentalCodeStatuses)
    {
        return null;
    }

    public RentalCodeStatus update (RentalCodeStatus rentalCodeStatuses)
    {
        return null;
    }

    public void delete(String rentalCodeStatuses)
    {

    }

    public Set<RentalCodeStatus> getAll()
    {
        final Set<RentalCodeStatus> rentalCodeStatuses = this.rentalCodeStatuses;
        return rentalCodeStatuses;
    }
}
