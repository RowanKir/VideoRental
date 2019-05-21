package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Movie.Actor;
import ac.za.cput.Repository.ActorRepository;
import ac.za.cput.Repository.Impl.ActorRepositoryImpl;
import ac.za.cput.Services.Movie.ActorService;

import java.util.Set;

public class ActorServiceImpl implements ActorService {

    private static ActorServiceImpl service = null;
    private ActorRepository repository;

    private ActorServiceImpl()
    {
        this.repository = ActorRepositoryImpl.getRepository();
    }

    public static ActorServiceImpl getService(){
        if (service == null) service = new ActorServiceImpl();
        return service;
    }

    @Override
    public Actor create(Actor type) {
        return this.repository.create(type);

    }

    @Override
    public Actor update(Actor type) {
        return this.repository.update(type);

    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Actor read(String s) {
        return this.repository.read(s);    }

    @Override
    public Set<Actor> getAll() {
        return this.repository.getAll();

    }
}
