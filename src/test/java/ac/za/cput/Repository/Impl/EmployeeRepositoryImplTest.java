package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Store.Employee;
import ac.za.cput.Factory.Store.EmployeeFactory;
import ac.za.cput.Repository.EmployeeRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRepositoryImplTest {

    private EmployeeRepository repository;
    private Employee emp;

    private Employee getSavedEmployee()
    {
        Set<Employee> savedEmployee = this.repository.getAll();
        return savedEmployee.iterator().next();
    }
    @Before
    public void setUp() throws Exception
    {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.emp = EmployeeFactory.buildEmployee("1","Rowan","Mr.","Gore Street");
    }


    @Test
    public void a_create()
    {
        Employee created = this.repository.create(this.emp);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.emp);

    }

    @Test
    public void b_read()
    {
        Employee savedEmployee = getSavedEmployee();
        System.out.println("In read, courseId = "+ savedEmployee.getEmpId());
        Employee read = this.repository.read(savedEmployee.getEmpId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedEmployee, read);
    }

    @Test
    public void c_update()
    {
        String newname = "New Test Course Name";
        Employee account = new Employee.Builder().copy(getSavedEmployee()).empName(newname).build();
        System.out.println("In update, about_to_updated = " + account);
        Employee updated = this.repository.update(account);
        System.out.println("In update, updated = " + updated);
        assertSame(newname, updated.getEmpName());
        d_getAll();
    }

    @Test
    public void e_delete()
    {
        Employee savedAccount = getSavedEmployee();
        this.repository.delete(savedAccount.getEmpId());
        d_getAll();
    }

    @Test
    public void d_getAll()
    {
        Set<Employee> accounts =  this.repository.getAll();
        System.out.println("In getAll, all = " + accounts);
    }
}