package com.springjdbc._spring.jpa.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
	
	@Id
	private String empId;
	private String name;

}
