package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	Welcome welcome;
	
	@RequestMapping("/")
	public String getString(){
		return  "Hello World ";
	}
	@RequestMapping("/hello")
	public String getString_(){
		return  "Hello World onee";
	}
	@RequestMapping("/ser")
	public String getWelcome(){
		return welcome.getData();
	}
}
