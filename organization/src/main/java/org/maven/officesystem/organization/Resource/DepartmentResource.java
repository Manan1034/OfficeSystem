package org.maven.officesystem.organization.Resource;

import java.util.List;

import org.maven.officesystem.organization.Base.Department;
import org.maven.officesystem.organization.Base.Employee;
import org.maven.officesystem.organization.Service.DepartmentService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/departments")
public class DepartmentResource 
{
	DepartmentService departmentservice;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getDepartmentNames()
	{
		return departmentservice.getAllDepartmentNames();
	}
	
	@Path("/viadepartmentid/{deptid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Department getDepartmentDetails(@PathParam("deptid") int departmentid)
	{
		return departmentservice.getDepartmentDetails(departmentid);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String addDepartment(Department department)
	{
		String res=departmentservice.addDepartment(department);
		return res;
	}
	
	@Path("/viadepartmentname/{deptname}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getemployeeByDepartment(@PathParam("deptname") String departmentname)
	{
		return departmentservice.getEmployeesByDepartment(departmentname);
	}
	
	@Path("/getdepartmentid/{deptname}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Department getDepartmentbyName(@PathParam("deptname") String departmentname)
	{
		return departmentservice.getDepartmentDetailsviaName(departmentname);
	}
	
}
