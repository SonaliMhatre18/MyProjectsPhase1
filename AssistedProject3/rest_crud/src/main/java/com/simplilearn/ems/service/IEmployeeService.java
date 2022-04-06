package com.simplilearn.ems.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.simplilearn.ems.entity.Employee;

public interface IEmployeeService {
	
	public Employee addEmployee(Employee employee); // insert
	public Employee getEmployeeById(int id); // select by id
	public Employee updateEmployee(Employee employee); // update
	public ResponseEntity<String> deleteById(int id); // delete
	public List<Employee> getAllEmployee();
	public List<Employee> findByName(String name);

}
