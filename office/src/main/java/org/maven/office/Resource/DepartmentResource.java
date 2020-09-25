package org.maven.office.Resource;

import java.util.List;

import org.maven.office.Base.Department;
import org.maven.office.Base.Employee;
import org.maven.office.Service.DepartmentService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/departments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DepartmentResource 
{
	DepartmentService departmentservice;
	
	@GET
	//@Produces(MediaType.APPLICATION_JSON)
	public List<String> getDepartmentNames()
	{
		return departmentservice.getAllDepartmentNames();
	}
	
	@GET
	@Path("/viadepartmentid/{deptid}")
	//@Produces(MediaType.APPLICATION_JSON)
	public Department getDepartmentDetails(@PathParam("deptid") int departmentid)
	{
		return departmentservice.getDepartmentDetails(departmentid);
	}
	
	@POST
	//@Consumes(MediaType.APPLICATION_JSON)
	public String addDepartment(Department department)
	{
		String res=departmentservice.addDepartment(department);
		return res;
	}
	
	@GET
	@Path("/viadepartmentname/{deptname}")
	//@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getemployeeByDepartment(@PathParam("deptname") String departmentname)
	{
		return departmentservice.getEmployeesByDepartment(departmentname);
	}
	
	@GET
	@Path("/getdepartmentid/{deptname}")
	//@Produces(MediaType.APPLICATION_JSON)
	public Department getDepartmentbyName(@PathParam("deptname") String departmentname)
	{
		return departmentservice.getDepartmentDetailsviaName(departmentname);
	}
	
}
