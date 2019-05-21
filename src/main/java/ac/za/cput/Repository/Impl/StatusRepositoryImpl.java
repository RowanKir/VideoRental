package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.Status;
import ac.za.cput.Repository.StatusRepository;


import java.util.HashSet;
import java.util.Set;

public class StatusRepositoryImpl implements StatusRepository {

    private static StatusRepositoryImpl repository = null;
    private Set<Status> statuses = new HashSet<>();

    public static StatusRepositoryImpl getRepository()
    {
        if(repository == null) repository = new StatusRepositoryImpl();
        return repository;
    }

    public Status create (Status statuses)
    {
        this.statuses.add(statuses);
        return statuses;
    }

    public Status read (String statuses)
    {
        return null;
    }

    public Status update (Status statuses)
    {
        return null;
    }

    public void delete(String rentalCodeStatuses)
    {

    }

    public Set<Status> getAll()
    {
        final Set<Status> statuses = this.statuses;
        return statuses;
    }
}
