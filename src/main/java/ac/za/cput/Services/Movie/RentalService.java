package ac.za.cput.Services.Movie;

import ac.za.cput.Domain.Movie.Rental;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface RentalService extends IService<Rental, String>
{
    Set<Rental> getAll();
}
