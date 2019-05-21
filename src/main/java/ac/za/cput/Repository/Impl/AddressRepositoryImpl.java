package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Store.StoreAddress;
import ac.za.cput.Repository.AddressRepository;

import java.util.HashSet;
import java.util.Set;

public class AddressRepositoryImpl implements AddressRepository {

    private static AddressRepositoryImpl repository = null;
    private Set<StoreAddress> address = new HashSet<>();

    static AddressRepositoryImpl getRepository()
    {
        if (repository == null) repository = new AddressRepositoryImpl();
        return repository;
    }

    public StoreAddress create (StoreAddress address)
    {
        this.address.add(address);
        return address;
    }

    public StoreAddress read (String address)
    {
        return null;
    }

    public StoreAddress update (StoreAddress address)
    {
        return null;
    }

    public void delete(String address)
    {

    }

    public Set<StoreAddress> getAll()
    {
        final Set<StoreAddress> address = this.address;
        return address;
    }
}
