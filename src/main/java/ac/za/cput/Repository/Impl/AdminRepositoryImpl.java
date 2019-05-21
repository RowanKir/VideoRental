package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Store.Admin;
import ac.za.cput.Repository.AdminRepository;

import java.util.HashSet;
import java.util.Set;

public class AdminRepositoryImpl implements AdminRepository {

    private static AdminRepositoryImpl repository = null;
    private Set<Admin> admin = new HashSet<>();

    public static AdminRepositoryImpl getRepository()
    {
        if (repository == null) repository = new AdminRepositoryImpl();
        return repository;
    }

    public Admin create (Admin admin)
    {
        this.admin.add(admin);
        return admin;
    }

    public Admin read (String admin)
    {
        return null;
    }

    public Admin update (Admin admin)
    {
        return null;
    }

    public void delete(String admin)
    {

    }

    public Set<Admin> getAll()
    {
        final Set<Admin> admin = this.admin;
        return admin;
    }
}
