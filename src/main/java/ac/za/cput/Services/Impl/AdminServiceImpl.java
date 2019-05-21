package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Store.Admin;
import ac.za.cput.Repository.AdminRepository;
import ac.za.cput.Repository.Impl.AdminRepositoryImpl;
import ac.za.cput.Services.Store.AdminService;

import java.util.Set;

public class AdminServiceImpl implements AdminService {

    private static AdminServiceImpl service = null;
    private AdminRepository repository;

    private AdminServiceImpl()
    {
        this.repository = AdminRepositoryImpl.getRepository();
    }

    public static AdminServiceImpl getService(){
        if (service == null) service = new AdminServiceImpl();
        return service;
    }

    @Override
    public Admin create(Admin type) {
        return this.repository.create(type);
    }

    @Override
    public Admin update(Admin type) {
        return this.repository.update(type);

    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Admin read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Admin> getAll() {
        return this.repository.getAll();
    }
}
