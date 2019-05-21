package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Repository.Impl.MovieRepositoryImpl;
import ac.za.cput.Repository.MovieRepository;
import ac.za.cput.Services.Movie.MovieService;

import java.util.Set;

public class MovieServiceImpl implements MovieService {

    private static MovieServiceImpl service = null;
    private MovieRepository repository;

    private MovieServiceImpl()
    {
        this.repository = MovieRepositoryImpl.getRepository();
    }

    public static MovieServiceImpl getService(){
        if (service == null) service = new MovieServiceImpl();
        return service;
    }

    @Override
    public Movie create(Movie type) {
        return this.repository.create(type);
    }

    @Override
    public Movie update(Movie type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Movie read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Movie> getAll() {
        return this.repository.getAll();
    }


}
