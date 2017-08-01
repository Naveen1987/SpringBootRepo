package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.models.Student;

public interface MyRepository extends CrudRepository<Student, Integer>{

}
