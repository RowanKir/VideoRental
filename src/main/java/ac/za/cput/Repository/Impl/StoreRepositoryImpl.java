package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Store.Store;
import ac.za.cput.Repository.StoreRepository;

import java.util.HashSet;
import java.util.Set;

public class StoreRepositoryImpl implements StoreRepository {

    private static StoreRepositoryImpl repository = null;
    private Set<Store> store = new HashSet<>();

    public static StoreRepositoryImpl getRepository()
    {
        if(repository == null) repository = new StoreRepositoryImpl();
        return repository;
    }

    public Store create (Store store)
    {
        this.store.add(store);
        return store;
    }

    public Store read (String store)
    {
        return null;
    }

    public Store update (Store store)
    {
        return null;
    }

    public void delete(String store)
    {

    }

    public Set<Store> getAll()
    {
        final Set<Store> store = this.store;
        return store;
    }
}
