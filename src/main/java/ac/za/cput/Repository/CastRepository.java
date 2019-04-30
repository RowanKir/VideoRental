package ac.za.cput.Repository;

import ac.za.cput.Domain.Movie.MovieCast;

import java.util.Set;

public interface CastRepository extends IRepository<MovieCast, String>{
    Set<MovieCast> getAll();
}
