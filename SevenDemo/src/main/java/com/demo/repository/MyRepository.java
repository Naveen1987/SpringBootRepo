package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.models.Employees;

public interface MyRepository extends CrudRepository<Employees, Integer>,MyRepositoryCustom {

}
