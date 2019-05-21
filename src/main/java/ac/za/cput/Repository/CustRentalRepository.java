package ac.za.cput.Repository;

import ac.za.cput.Domain.Movie.CustRental;

import java.util.Set;

public interface CustRentalRepository extends IRepository<CustRental, String>{
    Set<CustRental> getAll();
}
