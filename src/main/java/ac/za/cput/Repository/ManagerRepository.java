package ac.za.cput.Repository;

import ac.za.cput.Domain.Store.Manager;

import java.util.Set;

public interface ManagerRepository extends IRepository<Manager, String>{
    Set<Manager> getAll();
}
