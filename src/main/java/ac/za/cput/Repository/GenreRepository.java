package ac.za.cput.Repository;

import ac.za.cput.Domain.Movie.Genre;

import java.util.Set;

public interface GenreRepository extends IRepository<Genre, String>{
    Set<Genre> getAll();
}
