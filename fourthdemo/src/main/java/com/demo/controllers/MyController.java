package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.services.MyService;

@RestController
public class MyController {

	@Autowired
	MyService myservice;
	@GetMapping("/")
	public String getIndex(){
		return "Index File "+myservice.getAllEmployee();
	}
	@PostMapping("/save")
	public String saveEmp(){
		myservice.saveEmployee();
		return "Saved";
	}
}
