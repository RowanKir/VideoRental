package ac.za.cput.Services.Store;

import ac.za.cput.Domain.Store.Store;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface StoreService extends IService<Store, String>
{
    Set<Store> getAll();
}
