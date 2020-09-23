package org.maven.officesystem.organization.Service;

import java.util.HashMap;

import org.maven.officesystem.organization.Base.Employee;
import org.maven.officesystem.organization.Database.Database;

public class EmployeeService 
{
	public static HashMap<String, Employee> employees= Database.getEmployees();

    public Employee getEmployeeDetails(String empid)
    {
        return employees.get(empid);
    }

    

    public String addEmployee(Employee employee)
    {
        employees.put(employee.getEmployeeid(),employee);
        return "Employee Details added Successfully";
    }
    
    public void removeEmployeeById(String empid)
    {
    	employees.remove(empid);
    }
    
    public static HashMap<String, Employee> giveData()
    {
    	return employees;
    }
    
    public String updateEmployeeDetails(String employeeid,Employee emp)
    {
    	employees.put(employeeid,emp);
    	return "Employee Details updated";
    }

}
