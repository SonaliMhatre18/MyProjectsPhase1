package com.simplilearn.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.ems.entity.Employee;
import com.simplilearn.ems.service.IEmployeeService;

@RestController
@RequestMapping("/api/v1/employees/")
public class EmployeeController {
	
	@Autowired
	IEmployeeService service;
	
	@PostMapping("/post")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
		
	}
	
	@GetMapping("/get/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}
	
	@GetMapping("/getbyname/{name}")
	public List<Employee> findByName(@PathVariable String name) {
		return service.findByName(name);
	}
 
}
