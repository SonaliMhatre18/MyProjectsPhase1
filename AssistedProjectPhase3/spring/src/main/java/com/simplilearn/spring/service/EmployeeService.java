package com.simplilearn.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.spring.repository.EmployeeDAO;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDAO dao;
	
	public String getService() {
		 System.out.println(dao.getDAO()); 
		return "This is service call...";
	}

}
