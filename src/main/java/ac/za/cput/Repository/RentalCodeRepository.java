package ac.za.cput.Repository;

import ac.za.cput.Domain.Movie.RentalCodeStatus;

import java.util.Set;

public interface RentalCodeRepository extends IRepository<RentalCodeStatus, String>{
    Set<RentalCodeStatus> getAll();
}
