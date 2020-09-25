package org.maven.office.Service;

import java.util.HashMap;

import org.maven.office.Base.Department;
import org.maven.office.Base.Employee;
import org.maven.office.Database.Database;

public class EmployeeService 
{
	

    public Employee getEmployeeDetails(String empid)
    {
    	HashMap<String, Employee> employees= Database.getEmployees();
        return employees.get(empid);
    }

    

    public String addEmployee(Employee employee)
    {
        Database.addEmployee(employee);
        Database.addDepartment(new Department(employee.getDepartmentname(),employee.getDepartmentid(),employee.getDepartmentsupervisor()));
        return "Employee Details added Successfully";
    }
    
    public void removeEmployeeById(String empid)
    {
    	Database.removeEmployee(empid);
    }
    
    public static HashMap<String, Employee> giveData()
    {
    	HashMap<String, Employee> employees= Database.getEmployees();
    	return employees;
    }
    
    public String updateEmployeeDetails(String employeeid,Employee emp)
    {
    	//HashMap<String, Employee> employees= Database.getEmployees();
    	//Employee employee=employees.get(employeeid);
    	Database.removeEmployee(employeeid);
    	Database.addEmployee(emp);
    	return "Employee Details updated";
    }

}
