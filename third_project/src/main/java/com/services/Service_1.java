package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dao.StudentDao;
import com.demo.NewRepo;
import com.demo.models.Student;

@Service
public class Service_1 {

	@Autowired
	StudentDao std;
	@Autowired
	NewRepo nrp;
	public String getStudent(){
	return "Service "+std.getStudent();
}
	public List<Student> getAll(){
		return nrp.findAll();
	}
	
}
