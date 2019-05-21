package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Member.Inventory;
import ac.za.cput.Repository.InventoryRepository;

import java.util.HashSet;
import java.util.Set;

public class InventoryRepositoryImpl implements InventoryRepository {

    private static InventoryRepositoryImpl repository = null;
    private Set<Inventory> inventory = new HashSet<>();

    public static InventoryRepositoryImpl getRepository()
    {
        if(repository == null) repository = new InventoryRepositoryImpl();
        return repository;
    }

    public Inventory create (Inventory inventory)
    {
        this.inventory.add(inventory);
        return inventory;
    }

    public Inventory read (String inventory)
    {
        return null;
    }

    public Inventory update (Inventory inventory)
    {
        return null;
    }

    public void delete(String inventory)
    {

    }

    public Set<Inventory> getAll()
    {
        final Set<Inventory> inventory = this.inventory;
        return inventory;
    }
}
