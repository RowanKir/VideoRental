package ac.za.cput.Repository;

import ac.za.cput.Domain.Movie.Movie;

import java.util.Set;

public interface MovieRepository extends IRepository<Movie, String> {
    Set<Movie> getAll();
}
