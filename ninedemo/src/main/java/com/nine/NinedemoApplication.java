package com.nine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NinedemoApplication {

	
	public static void main(String[] args) {
//		SpringApplication.run(NinedemoApplication.class, args);
		SpringApplication app=new SpringApplication(NinedemoApplication.class);
		app.setAdditionalProfiles("production");
		app.run(args);
		
	}
}
