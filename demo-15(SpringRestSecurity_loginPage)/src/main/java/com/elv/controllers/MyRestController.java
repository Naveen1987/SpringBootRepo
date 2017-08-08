package com.elv.controllers;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.elv.models.Student;
import com.elv.services.StudentService;

@RestController
public class MyRestController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	StudentService std;
	
		@GetMapping("/getall")
	public List<Student>getAll(){
		return std.getStudents();
	}
		@GetMapping("/getId")
		public Student getId(@RequestParam String id){
			return std.getStudent(id);
		}
}
