package com.pack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pack.model.Employee;
	
public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
