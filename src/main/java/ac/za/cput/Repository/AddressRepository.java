package ac.za.cput.Repository;

import ac.za.cput.Domain.Store.StoreAddress;

import java.util.Set;

public interface AddressRepository extends IRepository<StoreAddress, String>{
    Set<StoreAddress> getAll();
}
