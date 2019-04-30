package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.VideoRentalStore.Manager;
import ac.za.cput.Repository.ManagerRepository;

import java.util.HashSet;
import java.util.Set;

public class ManagerRepositoryImpl implements ManagerRepository {

    private static ManagerRepositoryImpl repository = null;
    private Set<Manager> manager = new HashSet<>();

    static ManagerRepositoryImpl getRepository()
    {
        if (repository == null) repository = new ManagerRepositoryImpl();
        return repository;
    }

    public Manager create (Manager manager)
    {
        this.manager.add(manager);
        return manager;
    }

    public Manager read (Manager manager)
    {
        return null;
    }

    public Manager update (Manager manager)
    {
        return null;
    }

    public void delete(String manager)
    {

    }

    public Set<Manager> getAll()
    {
        final Set<Manager> manager = this.manager;
        return manager;
    }
}
