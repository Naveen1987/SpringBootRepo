package com.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.demo.models.Student;

public interface NewRepo extends CrudRepository<Student, Long> {
List<Student> findAll();
}
