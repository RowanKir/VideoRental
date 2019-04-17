package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.RentalCodeStatus;

public class RentalCodeStatusFactory {

    public static RentalCodeStatus getRentalCodeStatus(String rentalCodeStatus,String rentalStatusDescription)
    {
        return new RentalCodeStatus.Builder()
            .rentalCodeStatus(rentalCodeStatus)
            .rentalStatusDescription(rentalStatusDescription)
            .build();
    }
}
