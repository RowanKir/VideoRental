package ac.za.cput.Repository;

import ac.za.cput.Domain.Store.Store;

import java.util.Set;

public interface StoreRepository extends IRepository<Store, String>{
    Set<Store> getAll();
}
