package com.ten.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ten.models.Student;
import com.ten.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo stdRepo;
	public boolean save(Student s){
		stdRepo.save(s);
		return true;
	}
	public List<Student> getStudents(){
		return stdRepo.findAll();
	}
	public void delete(String sid){
		stdRepo.delete(sid);
	}
}
