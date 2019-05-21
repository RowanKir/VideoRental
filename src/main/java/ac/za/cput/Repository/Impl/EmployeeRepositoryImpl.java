package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Store.Employee;
import ac.za.cput.Repository.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Set<Employee> emp = new HashSet<>();

    public static EmployeeRepositoryImpl getRepository()
    {
        if(repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    public Employee create (Employee emp)
    {
        this.emp.add(emp);
        return emp;
    }

    public Employee read (String emp)
    {
        return null;
    }

    public Employee update (Employee emp)
    {
        return null;
    }

    public void delete(String emp)
    {

    }

    public Set<Employee> getAll()
    {
        final Set<Employee> emp = this.emp;
        return emp;
    }
}
