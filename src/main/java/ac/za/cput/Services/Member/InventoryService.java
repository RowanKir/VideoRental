package ac.za.cput.Services.Member;

import ac.za.cput.Domain.Member.Inventory;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface InventoryService extends IService<Inventory, String>
{
    Set<Inventory> getAll();
}
