package ac.za.cput.Repository;

import ac.za.cput.Domain.Movie.Status;

import java.util.Set;

public interface StatusRepository extends IRepository<Status, String>{
    Set<Status> getAll();
}
