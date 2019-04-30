package ac.za.cput.Repository;

import ac.za.cput.Domain.Member.Inventory;

import java.util.Set;

public interface InventoryRepository extends IRepository<Inventory, String>{
    Set<Inventory> getAll();
}
