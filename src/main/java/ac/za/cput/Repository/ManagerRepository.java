package ac.za.cput.Repository;

import ac.za.cput.Domain.VideoRentalStore.Manager;

import java.util.Set;

public interface ManagerRepository extends IRepository<Manager, String>{
    Set<Manager> getAll();
}
