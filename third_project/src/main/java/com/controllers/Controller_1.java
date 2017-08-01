package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.Service_1;

@RestController
public class Controller_1 {

	@Autowired
	Service_1 service_1;
	
@GetMapping("/")
public String getIndex(){
	return "Welcome to All "+service_1.getStudent()+service_1.getAll();
}
}
