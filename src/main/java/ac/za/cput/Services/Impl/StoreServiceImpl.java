package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Store.Store;
import ac.za.cput.Repository.Impl.StoreRepositoryImpl;
import ac.za.cput.Repository.StoreRepository;
import ac.za.cput.Services.Store.StoreService;

import java.util.Set;

public class StoreServiceImpl implements StoreService {

    private static StoreServiceImpl service = null;
    private StoreRepository repository;

    private StoreServiceImpl()
    {
        this.repository = StoreRepositoryImpl.getRepository();
    }

    public static StoreServiceImpl getService(){
        if (service == null) service = new StoreServiceImpl();
        return service;
    }

    @Override
    public Store create(Store type) {
        return this.repository.create(type);
    }

    @Override
    public Store update(Store type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Store read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Store> getAll() {
        return this.repository.getAll();
    }
}
