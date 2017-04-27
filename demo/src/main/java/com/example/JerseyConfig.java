package com.example;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.controller.EmployeeController;
import com.example.controller.GsonController;

/**
 * @author igortc
 * @since 27 de abr de 2017
 *
 */
@Component
public class JerseyConfig extends ResourceConfig {

	/**
	 * 
	 */
	public JerseyConfig() {
		register(EmployeeController.class);
		register(GsonController.class);
		register(GsonProvider.class);
	}

}
