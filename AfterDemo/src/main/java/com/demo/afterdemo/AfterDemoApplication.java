package com.demo.afterdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.others.Student;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class AfterDemoApplication {

	@Autowired
	private static ApplicationContext ap;
	
	public static void main(String[] args) {
		SpringApplication.run(AfterDemoApplication.class, args);
	
	}
}
