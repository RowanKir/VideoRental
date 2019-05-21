package ac.za.cput.Services.Movie;

import ac.za.cput.Domain.Movie.CustRental;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface CustomerRentalService extends IService<CustRental, String>
{
    Set<CustRental> getAll();
}
