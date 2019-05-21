package ac.za.cput.Services.Store;

import ac.za.cput.Domain.Store.Admin;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface AdminService extends IService<Admin, String>
{
    Set<Admin> getAll();
}
