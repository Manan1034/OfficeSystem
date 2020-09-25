package org.maven.office.Database;

import java.util.HashMap;

import org.maven.office.Base.Department;
import org.maven.office.Base.Employee;

public class Database 
{
	public static HashMap<String, Employee> employees=new HashMap<String,Employee>();
	

    public static HashMap<Integer, Department> departments=new HashMap<Integer, Department>();

    public static HashMap<String,Employee> getEmployees()
    {
    	Employee e1=new Employee("Gopal","t123",23,"male","Engineering",1,"XYZ");
    	employees.put("t123", e1);
        return employees;
    }

    public static HashMap<Integer, Department> getDepartments() {
        return departments;
    }
    
    public static void addEmployee(Employee emp)
    {
    	employees.put(emp.getEmployeeid(), emp);
    }
    
    public static void addDepartment(Department dept)
    {
    	departments.put(dept.getDepartmentid(), dept);
    }
    
    public static void removeEmployee(String empid)
    {
    	employees.remove(empid);
    }
    
}
