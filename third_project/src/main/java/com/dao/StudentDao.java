package com.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.demo.models.Student;

@Repository
public class StudentDao {

	public String getStudent(){
		return new Student(){{setSid(10);setSname("Rajat");setSfee(12000);}}.toString();
	}
}
