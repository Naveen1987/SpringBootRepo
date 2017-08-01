package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.models.Employees;
import com.demo.services.MyService;

@RestController
public class MyController {
	@Autowired 
	MyService mys;
	
	@GetMapping("/")
	public String getIndex(){
		return "Index";
	}
	
	@PostMapping("/save")
	public Employees saveEmp(@RequestBody Employees e){
	return mys.saveEmp(e);
	}
	
	@GetMapping("/get/{eid}/{ename}")
	public Employees getEmp(@PathVariable int eid,@PathVariable String ename){
	return mys.getEmp(eid,ename);
	}
}
