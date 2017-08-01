package com.demo.services;

import java.util.Iterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.models.Student;
import com.demo.repositories.MyRepository;
@Service
public class MyService {

	@Autowired
	private MyRepository myr;
	
	public Student save(Student s){
		return myr.save(s);
	}
	
	public Student update(Student s){
		return myr.save(s);
	}
	
	public Iterable<Student> findAll(){
		return  myr.findAll();
	}
	public boolean delete(int id){
		myr.delete(id);
		return true;
	}
	public boolean deleteAll(){
		myr.deleteAll();
		return true;
	}
	public Student findOne(int id){
		return myr.findOne(id);
	}

}
