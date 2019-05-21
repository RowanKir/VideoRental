package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.MovieCast;
import ac.za.cput.Repository.CastRepository;

import java.util.HashSet;
import java.util.Set;

public class CastRepositoryImpl implements CastRepository {

    private static CastRepositoryImpl repository = null;
    private Set<MovieCast> cast = new HashSet<>();

    public static CastRepositoryImpl getRepository()
    {
        if (repository == null) repository = new CastRepositoryImpl();
        return repository;
    }

    public MovieCast create (MovieCast cast)
    {
        this.cast.add(cast);
        return cast;
    }

    public MovieCast read (String cast)
    {
        return null;
    }

    public MovieCast update (MovieCast cast)
    {
        return null;
    }

    public void delete(String cast)
    {

    }

    public Set<MovieCast> getAll()
    {
        final Set<MovieCast> cast = this.cast;
        return cast;
    }
}
