package org.maven.office.Resource;

import org.maven.office.Base.Employee;
import org.maven.office.Service.EmployeeService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class EmployeeResource 
{
	EmployeeService employeeservice=new EmployeeService();

	@Path("/{employeeid}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("employeeid") String employeeid)
    {
		return employeeservice.getEmployeeDetails(employeeid);
    }
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addEmployee(Employee employee)
	{
		employeeservice.addEmployee(employee);
		return "Added";
	}
	
	@Path("/{employeeid}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String updateEmployeeDetails(@PathParam("employeeid") String employeeid, Employee employee)
	{
		String result=employeeservice.updateEmployeeDetails(employeeid,employee);
		return result;
	}
	

}
