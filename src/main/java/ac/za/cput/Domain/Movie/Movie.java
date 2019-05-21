package ac.za.cput.Domain.Movie;

import ac.za.cput.Domain.Account.Account;

public class Movie {

    int  conditionCode, formatTypeCode, gendreCode, storeId, yearRelease, movieRating, numOfStock;
    String movieTitle, movieId, movieDescription;
    double rentalRate, rentalPrice = 0.00;

    public Movie(Builder builder) {
        this.movieId = builder.movieId;
        this.conditionCode = builder.conditionCode;
        this.formatTypeCode = builder.formatTypeCode;
        this.gendreCode = builder.gendreCode;
        this.storeId = builder.storeId;
        this.yearRelease = builder.yearRelease;
        this.movieRating = builder.movieRating;
        this.numOfStock = builder.numOfStock;
        this.movieTitle = builder.movieTitle;
        this.movieDescription = builder.movieDescription;
        this.rentalRate = builder.rentalRate;
        this.rentalPrice = builder.rentalPrice;
    }

    public String getMovieId() {
        return movieId;
    }

    public int getConditionCode() {
        return conditionCode;
    }

    public int getFormatTypeCode() {
        return formatTypeCode;
    }

    public int getGendreCode() {
        return gendreCode;
    }

    public int getStoreId() {
        return storeId;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public int getNumOfStock() {
        return numOfStock;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public static class Builder
    {
        String movieId;
        int conditionCode;
        int formatTypeCode;
        int gendreCode;
        int storeId;
        int yearRelease;
        int movieRating;
        int numOfStock;
        String movieTitle, movieDescription;
        double rentalRate, rentalPrice = 0.00;

        public Builder movieId(String movieId)
        {
            this.movieId = movieId;
            return this;
        }

        public Builder conditionCode(int conditionCode)
        {
            this.conditionCode = conditionCode;
            return this;
        }

        public Builder formatTypeCode(int formatTypeCode)
        {
            this.formatTypeCode = formatTypeCode;
            return this;
        }

        public Builder gendreCode(int gendreCode)
        {
            this.gendreCode = gendreCode;
            return this;
        }

        public Builder storeId(int storeId)
        {
            this.storeId = storeId;
            return this;
        }

        public Builder yearRelease(int yearRelease)
        {
            this.yearRelease = yearRelease;
            return this;
        }

        public Builder movieRating(int movieRating)
        {
            this.movieRating = movieRating;
            return this;
        }

        public Builder numOfStock(int numOfStock)
        {
            this.numOfStock = numOfStock;
            return this;
        }

        public Builder movieTitle(String movieTitle)
        {
            this.movieTitle = movieTitle;
            return this;
        }

        public Builder movieDescription(String movieDescription)
        {
            this.movieDescription = movieDescription;
            return this;
        }

        public Builder rentalRate(double rentalRate)
        {
            this.rentalRate = rentalRate;
            return this;
        }

        public Builder rentalPrice(double rentalPrice)
        {
            this.rentalPrice = rentalPrice;
            return this;
        }

        public Builder copy(Movie movie){
            this.movieId = movie.movieId;
            this.movieTitle = movie.movieTitle;

            return this;
        }

        public Movie build()
        {
            return new Movie(this);
        }


    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", conditionCode=" + conditionCode +
                ", formatTypeCode=" + formatTypeCode +
                ", gendreCode=" + gendreCode +
                ", storeId=" + storeId +
                ", yearRelease=" + yearRelease +
                ", movieRating=" + movieRating +
                ", numOfStock=" + numOfStock +
                ", movieTitle='" + movieTitle + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                ", rentalRate=" + rentalRate +
                ", rentalPrice=" + rentalPrice +
                '}';
    }
}
