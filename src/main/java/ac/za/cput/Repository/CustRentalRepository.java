package ac.za.cput.Repository;

import ac.za.cput.Domain.Movie.CustomerRental;

import java.util.Set;

public interface CustRentalRepository extends IRepository<CustomerRental, String>{
    Set<CustomerRental> getAll();
}
