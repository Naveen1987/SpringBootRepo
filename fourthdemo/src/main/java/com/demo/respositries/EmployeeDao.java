package com.demo.respositries;

import java.util.List;



import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.Employee;

//First Args- name of class
//Second Args-Data type of @Id variable
@Transactional
public interface EmployeeDao extends CrudRepository<Employee, Long>{
public List<Employee>findAll();
}
