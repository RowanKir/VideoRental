package ac.za.cput.Factory.VideoRentalStore;

import ac.za.cput.Domain.VideoRentalStore.Employee;

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
