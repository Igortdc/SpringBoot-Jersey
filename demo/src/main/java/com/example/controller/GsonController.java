package com.example.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;

/**
 * @author igortc
 * @since 27 de abr de 2017
 *
 */
@Component
@Path("/Gson")
public class GsonController {

	/**
	 * @param employee
	 * @return Response
	 */
	@POST
	@Path(value = "/teste")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response process2(Employee employee) {
		
		Employee testeEmployee = new Employee();
		testeEmployee.setEmpId("2131");
		testeEmployee.setName("Fulano da Silva");
		Gson gson = new Gson();
		gson.toJson(testeEmployee);
		
		return Response.status(401).entity(employee).build();
	}
	
}
