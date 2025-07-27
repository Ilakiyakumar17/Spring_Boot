package com.csc.driving;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DrivingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(DrivingApplication.class, args);
	
		Driver d=var.getBean(Driver.class);
		d.driving();
		
		
		
		
	}

}
