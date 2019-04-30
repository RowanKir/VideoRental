package ac.za.cput.Repository;

import ac.za.cput.Domain.VideoRentalStore.Admin;

import java.util.Set;

public interface AdminRepository extends IRepository<Admin, String> {
    Set<Admin> getAll();
}
