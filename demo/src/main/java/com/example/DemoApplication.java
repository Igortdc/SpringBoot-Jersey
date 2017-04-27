package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author igortc
 * @since 27 de abr de 2017
 *
 */
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new DemoApplication().configure(new SpringApplicationBuilder(DemoApplication.class)).run(args);
	}
}
