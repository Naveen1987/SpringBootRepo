package com.ten.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ten.models.Student;

@Transactional
public interface StudentRepo extends MongoRepository<Student, String>{

}
