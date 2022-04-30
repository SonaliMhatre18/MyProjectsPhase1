package com.simplilearn.spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO { // repository or DAO class
	
	public String getDAO() {
		return "This is DAO Class";
	}

}
