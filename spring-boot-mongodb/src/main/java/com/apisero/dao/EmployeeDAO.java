package com.apisero.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apisero.model.Employee;

@Repository
public interface EmployeeDAO extends MongoRepository<Employee, Integer> {

}
