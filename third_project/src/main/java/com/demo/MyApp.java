package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.controllers","com.services","com.dao"})
public class MyApp {
public static void main(String ag[]) {
		SpringApplication.run(MyApp.class, ag);
}
}
