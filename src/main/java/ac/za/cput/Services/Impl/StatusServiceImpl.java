package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Movie.Status;
import ac.za.cput.Repository.Impl.StatusRepositoryImpl;
import ac.za.cput.Repository.StatusRepository;
import ac.za.cput.Services.Movie.StatusService;

import java.util.Set;

public class StatusServiceImpl implements StatusService {

    private static StatusServiceImpl service = null;
    private StatusRepository repository;

    private StatusServiceImpl()
    {
        this.repository = StatusRepositoryImpl.getRepository();
    }

    public static StatusServiceImpl getService(){
        if (service == null) service = new StatusServiceImpl();
        return service;
    }

    @Override
    public Status create(Status type) {
        return this.repository.create(type);
    }

    @Override
    public Status update(Status type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Status read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Status> getAll() {
        return this.repository.getAll();
    }
}
