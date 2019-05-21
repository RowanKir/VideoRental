package ac.za.cput.Services.Store;

import ac.za.cput.Domain.Store.Manager;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface ManagerService extends IService<Manager, String>
{
    Set<Manager> getAll();
}
