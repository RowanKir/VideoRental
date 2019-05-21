package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Store.Employee;
import ac.za.cput.Repository.EmployeeRepository;
import ac.za.cput.Repository.Impl.EmployeeRepositoryImpl;
import ac.za.cput.Services.Store.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl()
    {
        this.repository = EmployeeRepositoryImpl.getRepository();
    }

    public static EmployeeServiceImpl getService(){
        if (service == null) service = new EmployeeServiceImpl();
        return service;
    }

    @Override
    public Employee create(Employee type) {
        return this.repository.create(type);
    }

    @Override
    public Employee update(Employee type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);

    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }

}
