package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EightDemoApplication implements CommandLineRunner {

	@Autowired
    private WeatherService weatherService;
	
	public static void main(String[] args) {
		SpringApplication.run(EightDemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
	weatherService.forecast();
	}
}
