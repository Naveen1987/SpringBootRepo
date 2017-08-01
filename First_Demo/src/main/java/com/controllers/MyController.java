package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(value="/")
	public String hello(){
		System.out.println("Home Page");
		return "index.html";
	}
}
