package org.maven.officesystem.organization.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.maven.officesystem.organization.Base.Department;
import org.maven.officesystem.organization.Base.Employee;
import org.maven.officesystem.organization.Database.Database;

public class DepartmentService 
{
	public HashMap<Integer, Department> departments= Database.getDepartments();

    public String addDepartment(Department dept)
    {
        departments.put(dept.getDepartmentid(),dept);
        return "Department added successfully";
    }

    public Department getDepartmentDetailsviaName(String deptname)
    {
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
    	HashMap<String,Employee> employee=EmployeeService.giveData();
    	Set<String> departments=new HashSet();
    	List<String> dept=new ArrayList();
    	for(Employee e1:employee.values())
    	{
    		departments.add(e1.getDepartmentname());
    	}
    	for(String dep:departments)
    	{
    		dept.add(dep);
    	}
    	
    	return dept;
    }

}
