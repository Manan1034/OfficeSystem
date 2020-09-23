package org.maven.officesystem.organization.Resource;

import org.maven.officesystem.organization.Base.Employee;
import org.maven.officesystem.organization.Service.EmployeeService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

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
