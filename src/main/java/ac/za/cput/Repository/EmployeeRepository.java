package ac.za.cput.Repository;

import ac.za.cput.Domain.Store.Employee;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}
