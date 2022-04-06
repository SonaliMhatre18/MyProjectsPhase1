package com.simplilearn.ems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Repeat;

import com.simplilearn.ems.entity.Employee;
import com.simplilearn.ems.service.IEmployeeService;

@SpringBootTest
class EmployeeServiceImplTest {
	
	@Autowired
	IEmployeeService service;
	
	static Employee employee;
	
	@BeforeAll
	public static void beforeAll() {
		employee = new Employee(0,"Will Smith",10000);
		System.out.println("Before all test cases");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After all test cases");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before each test cases");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After each test cases");
	}
 
	@Test
	@DisplayName("AddTest")
	@Repeat(value = 3)
	void testAddEmployee() {
		System.out.println("Add test cases");
		Employee addedEmployee = service.addEmployee(employee);
		assertEquals("Will Smith", addedEmployee.getName());
	}

	@Test
	void testGetEmployeeById() {
		System.out.println("Get test cases");
		Employee emp = service.getEmployeeById(3);
		assertEquals(75000, emp.getSalary());
	}

	@Test
	void testUpdateEmployee() {
		
	}

	@Test
	void testDeleteById() {
		
	}

}
