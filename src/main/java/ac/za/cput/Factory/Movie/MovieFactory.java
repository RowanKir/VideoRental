package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.Movie;

public class MovieFactory {
    public static Movie buildMovie (String movieId,int conditionCode,int formatTypeCode)
    {
        return new Movie.Builder()
                .movieId(movieId)
                .formatTypeCode(formatTypeCode)
                .build();

    }
}
