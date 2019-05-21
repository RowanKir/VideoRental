package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Store.Manager;
import ac.za.cput.Repository.Impl.ManagerRepositoryImpl;
import ac.za.cput.Repository.ManagerRepository;
import ac.za.cput.Services.Store.ManagerService;

import java.util.Set;

public class ManagerServiceImpl implements ManagerService {

    private static ManagerServiceImpl service = null;
    private ManagerRepository repository;

    private ManagerServiceImpl()
    {
        this.repository = ManagerRepositoryImpl.getRepository();
    }

    public static ManagerServiceImpl getService(){
        if (service == null) service = new ManagerServiceImpl();
        return service;
    }

    @Override
    public Manager create(Manager type) {
        return this.repository.create(type);
    }

    @Override
    public Manager update(Manager type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Manager read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Manager> getAll() {
        return this.repository.getAll();
    }
}
