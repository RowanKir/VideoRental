package ac.za.cput.Factory.Store;

import ac.za.cput.Domain.Store.Employee;

public class EmoloyeeFactory {

    public static Employee getEmployee(int empId,String empName,String empTitle,String empAdress)
    {
        return new Employee.Builder()
                .empId(empId)
                .empName(empName)
                .empTitle(empTitle)
                .empAdress(empAdress)
                .build();
    }
}
