package com.elv.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.elv.models.Student;

@Transactional
public interface StudentRepo extends MongoRepository<Student, String>{

}
