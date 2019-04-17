package ac.za.cput.Domain.Movie;

public class CustomerRental {

    int itemRentalId, customerId, movieId, rentalStatusCode;

    public CustomerRental(Builder builder) {
        this.itemRentalId = builder.itemRentalId;
        this.customerId = builder.customerId;
        this.movieId = builder.movieId;
        this.rentalStatusCode = builder.rentalStatusCode;
    }

    public int getItemRentalId() {
        return itemRentalId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getMovieId() {
        return movieId;
    }

    public int getRentalStatusCode() {
        return rentalStatusCode;
    }

    public static class Builder
    {
        int itemRentalId, customerId, movieId, rentalStatusCode;

        public Builder itemRentalId (int itemRentalId)
        {
            this.itemRentalId = itemRentalId;
            return this;
        }

        public Builder customerId (int customerId)
        {
            this.customerId = customerId;
            return this;
        }

        public Builder movieId (int movieId)
        {
            this.movieId = movieId;
            return this;
        }

        public Builder rentalStatusCode (int rentalStatusCode)
        {
            this.rentalStatusCode = rentalStatusCode;
            return this;
        }

        public CustomerRental build()
        {
            return new CustomerRental(this);
        }
    }
}
