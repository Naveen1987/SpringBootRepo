package com.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyControler {

	@RequestMapping(value="/")
	public String getIndex(){
		System.out.println("This is me");
		return"index";
	}
//	/*@RequestMapping(value="/hello")
//	public String getIndex_1(){
//		System.out.println("This is me index_1");
//		return"index One";
//	}*/
}
