package org.maven.office.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.maven.office.Base.Department;
import org.maven.office.Base.Employee;
import org.maven.office.Database.Database;

public class DepartmentService 
{


    public String addDepartment(Department dept)
    {
        Database.addDepartment(dept);
        return "Department added successfully";
    }

    public Department getDepartmentDetailsviaName(String deptname)
    {
    	HashMap<Integer, Department> departments= Database.getDepartments();
        for(Department dept:departments.values())
        {
            if(dept.getDepartmentname()==deptname)
            {
                return dept;
            }
        }
        return null;
    }
    
    public List<Employee> getEmployeesByDepartment(String dept)
    {
        List<Employee> emp=new ArrayList<Employee>();
        for(Employee employ:EmployeeService.giveData().values())
        {
            if(employ.getDepartmentname().equalsIgnoreCase(dept))
            {
                emp.add(employ);
            }
        }

        return emp;
    }

    public Department getDepartmentDetails(int deptId)
    {
    	HashMap<Integer, Department> departments= Database.getDepartments();
        Department dept=departments.get(deptId);
        return dept;
    }

    /*public String getDepartmentSupervisorbyDepartmentId(int deptid)
    {
        Department dept=departments.get(deptid);
        return dept.getDepartmentsupervisor();
    }*/

 
    public List<String> getAllDepartmentNames()
    {
    	HashMap<Integer, Department> departments= Database.getDepartments();
    	List<String> department=new ArrayList<String>();
    	for(Department dept:departments.values())
    	{
    		department.add(dept.getDepartmentname());
    	}
    	
    	return department;
    }

}
