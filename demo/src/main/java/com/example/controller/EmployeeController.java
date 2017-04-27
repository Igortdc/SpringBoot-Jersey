package com.example.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

/**
 * @author igortc
 * @since 27 de abr de 2017
 *
 */
@Component
@Path("/Employee")
public class EmployeeController {

	/**
	 * @param nome 
	 * @return Employee
	 */
	@GET
	@Path(value = "/teste")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee process2( @QueryParam(value = "nome") String nome) {
		Employee employee = new Employee();
		employee.setEmpId("2");
		employee.setName("Igor");
		return employee;
	}
	
	/**
	 * @param name
	 * @param empId
	 * @return Employee
	 */
	@GET
	@Path(value = "/{name}/{empId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee process(@PathParam("name") String name, @PathParam("empId") String empId) {
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setName(name);
		return employee;
	}
}