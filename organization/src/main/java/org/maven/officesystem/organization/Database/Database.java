package org.maven.officesystem.organization.Database;

import java.util.HashMap;

import org.maven.officesystem.organization.Base.Department;
import org.maven.officesystem.organization.Base.Employee;

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
}
