package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.models.Employees;
import com.demo.repository.MyRepository;

@Service
public class MyService {
@Autowired 
MyRepository myr;
	public Employees saveEmp(Employees e){
		return myr.save(e);
	}
	public Employees getEmp(int eid,String ename){
		return myr.getEmp(eid,ename);
	}
}