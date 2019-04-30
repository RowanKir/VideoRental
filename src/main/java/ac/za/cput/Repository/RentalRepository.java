package ac.za.cput.Repository;

import ac.za.cput.Domain.Movie.Rental;

import java.util.Set;

public interface RentalRepository extends IRepository<Rental, String>{
    Set<Rental> getAll();
}
