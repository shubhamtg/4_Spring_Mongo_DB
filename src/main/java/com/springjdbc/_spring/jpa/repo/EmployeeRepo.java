package com.springjdbc._spring.jpa.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springjdbc._spring.jpa.model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, String> {
	

}
