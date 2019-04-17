package ac.za.cput.Domain.Movie;

public class RentalCodeStatus {

    String rentalCodeStatus, rentalStatusDescription;

    public RentalCodeStatus(Builder builder) {
        this.rentalCodeStatus = builder.rentalCodeStatus;
        this.rentalStatusDescription = builder.rentalStatusDescription;
    }

    public String getRentalCodeStatus() {
        return rentalCodeStatus;
    }

    public String getRentalStatusDescription() {
        return rentalStatusDescription;
    }

    public static class Builder
    {
        String rentalCodeStatus, rentalStatusDescription;

        public Builder rentalCodeStatus(String rentalCodeStatus)
        {
            this.rentalCodeStatus = rentalCodeStatus;
            return this;
        }

        public Builder rentalStatusDescription(String rentalStatusDescription)
        {
            this.rentalStatusDescription = rentalStatusDescription;
            return this;
        }

        public RentalCodeStatus build()
        {
            return new RentalCodeStatus(this);
        }
    }

    @Override
    public String toString() {
        return "RentalCodeStatus{" +
                "rentalCodeStatus='" + rentalCodeStatus + '\'' +
                ", rentalStatusDescription='" + rentalStatusDescription + '\'' +
                '}';
    }
}
