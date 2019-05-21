package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.CustRental;
import ac.za.cput.Repository.CustRentalRepository;

import java.util.HashSet;
import java.util.Set;

public class CustRentalRepositoryImpl implements CustRentalRepository {

    private static CustRentalRepositoryImpl repository = null;
    private Set<CustRental> custRental = new HashSet<>();

    public static CustRentalRepositoryImpl getRepository()
    {
        if(repository == null) repository = new CustRentalRepositoryImpl();
        return repository;
    }

    public CustRental create (CustRental custRental)
    {
        this.custRental.add(custRental);
        return custRental;
    }

    public CustRental read (String customerRental)
    {
        return null;
    }

    public CustRental update (CustRental custRental)
    {
        return null;
    }

    public void delete(String customerRental)
    {

    }

    public Set<CustRental> getAll()
    {
        final Set<CustRental> custRental = this.custRental;
        return custRental;
    }
}
