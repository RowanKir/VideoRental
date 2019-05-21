package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Member.Inventory;
import ac.za.cput.Repository.Impl.InventoryRepositoryImpl;
import ac.za.cput.Repository.InventoryRepository;
import ac.za.cput.Services.Member.InventoryService;

import java.util.Set;

public class InventoryServiceImpl implements InventoryService {

    private static InventoryServiceImpl service = null;
    private InventoryRepository repository;

    private InventoryServiceImpl()
    {
        this.repository = InventoryRepositoryImpl.getRepository();
    }

    public static InventoryServiceImpl getService(){
        if (service == null) service = new InventoryServiceImpl();
        return service;
    }

    @Override
    public Inventory create(Inventory type) {
        return this.repository.create(type);
    }

    @Override
    public Inventory update(Inventory type) {
        return this.repository.update(type);

    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Inventory read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Inventory> getAll() {
        return this.repository.getAll();
    }
}
