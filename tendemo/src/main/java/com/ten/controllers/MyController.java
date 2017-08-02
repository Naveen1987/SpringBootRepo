package com.ten.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ten.services.StudentService;

@Controller
public class MyController {
	@Autowired
	StudentService std;
	
	@GetMapping("/")
	public String getIndex(){
		return"index";
	}
	@GetMapping("/all")
	public ModelAndView getAll(){
		ModelAndView md=new ModelAndView("AllStudents");
		md.addObject("data", std.getStudents());
		return md;
	}
	
}
