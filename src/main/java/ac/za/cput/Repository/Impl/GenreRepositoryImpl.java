package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.Genre;
import ac.za.cput.Repository.GenreRepository;

import java.util.HashSet;
import java.util.Set;

public class GenreRepositoryImpl implements GenreRepository {

    private static GenreRepositoryImpl repository = null;
    private Set<Genre> genre = new HashSet<>();

    static GenreRepositoryImpl getRepository()
    {
        if(repository == null) repository = new GenreRepositoryImpl();
        return repository;
    }
    public Genre create (Genre genre)
    {
        this.genre.add(genre);
        return genre;
    }

    public Genre read (Genre genre)
    {
        return null;
    }

    public Genre update (Genre genre)
    {
        return null;
    }

    public void delete(String genre)
    {

    }

    public Set<Genre> getAll()
    {
        final Set<Genre> genre = this.genre;
        return genre;
    }

}
