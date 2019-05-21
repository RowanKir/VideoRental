package ac.za.cput.Services.Store;

import ac.za.cput.Domain.Store.StoreAddress;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface StoreAddressService extends IService<StoreAddress, String>
{
    Set<StoreAddress>getAll();
}
