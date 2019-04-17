package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.Movie;

public class MovieFactory {
    public static Movie getMovie (int movieId,int conditionCode,int formatTypeCode,int gendreCode,int storeId,int yearRelease,int movieRating,int numOfStock,
            String movieTitle,String movieDescription,double rentalRate,double rentalPrice)
    {
        return new Movie.Builder()
                .movieDescription(movieDescription)
                .movieId(movieId)
                .formatTypeCode(formatTypeCode)
                .gendreCode(gendreCode)
                .storeId(storeId)
                .yearRelease(yearRelease)
                .movieRating(movieRating)
                .numOfStock(numOfStock)
                .movieTitle(movieTitle)
                .movieDescription(movieDescription)
                .rentalRate(rentalRate)
                .rentalPrice(rentalPrice)
                .build();

    }
}
