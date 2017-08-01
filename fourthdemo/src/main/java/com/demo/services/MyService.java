package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.respositries.EmployeeDao;


@Service
public class MyService {
	
@Autowired
private EmployeeDao edao;

public List<Employee> getAllEmployee(){
	return edao.findAll();
}
public boolean saveEmployee(){
	Employee a=new Employee();
//	a.setEid(1);
	a.setEname("Rahul");
	a.setEsal(1000);
	System.out.println(a);
	Employee e=edao.save(a);
	System.out.println(e.getEid());
	if(e!=null){
	return true;
	}
	return false;
}
}
