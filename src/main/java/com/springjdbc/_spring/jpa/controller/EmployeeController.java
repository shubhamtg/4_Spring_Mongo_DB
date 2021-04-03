package com.springjdbc._spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springjdbc._spring.jpa.model.Employee;
import com.springjdbc._spring.jpa.repo.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepo empRepo;
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee e) {
		empRepo.save(e);
		return "Employee saved";
	}
}
