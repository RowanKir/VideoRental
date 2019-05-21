package ac.za.cput.Services.Movie;

import ac.za.cput.Domain.Movie.CustomerRental;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface CustomerRentalService extends IService<CustomerRental, String>
{
    Set<CustomerRental> getAll();
}
