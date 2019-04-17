package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.CustomerRental;

public class CustomerRentalFactory {

    public static CustomerRental getCustomerRental(int itemRentalId,int customerId,int movieId,int rentalStatusCode)
    {
        return new CustomerRental.Builder()
                .itemRentalId(itemRentalId)
                .customerId(customerId)
                .movieId(movieId)
                .rentalStatusCode(rentalStatusCode)
                .build();
    }
}
