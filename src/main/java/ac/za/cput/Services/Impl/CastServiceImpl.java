package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Movie.MovieCast;
import ac.za.cput.Repository.CastRepository;
import ac.za.cput.Repository.Impl.CastRepositoryImpl;
import ac.za.cput.Services.Movie.CastService;

import java.util.Set;

public class CastServiceImpl implements CastService {

    private static CastServiceImpl service = null;
    private CastRepository repository;

    private CastServiceImpl()
    {
        this.repository = CastRepositoryImpl.getRepository();
    }

    public static CastServiceImpl getService(){
        if (service == null) service = new CastServiceImpl();
        return service;
    }

    @Override
    public MovieCast create(MovieCast type) {
        return this.repository.create(type);

    }

    @Override
    public MovieCast update(MovieCast type) {
        return this.repository.update(type);

    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public MovieCast read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<MovieCast> getAll() {
        return this.repository.getAll();
    }


}
