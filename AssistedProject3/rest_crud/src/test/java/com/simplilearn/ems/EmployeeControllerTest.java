package com.simplilearn.ems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.simplilearn.ems.entity.Employee;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
@Log4j2
class EmployeeControllerTest {
	
	@Autowired
	RestTemplate restTemplate;
	
	Logger log = LoggerFactory.getLogger(EmployeeControllerTest.class);

	@Test
	@ParameterizedTest
	@ValueSource(ints = {11,14,16})
	void testGetEmployeeById(int id) {
		ResponseEntity<Employee> response = restTemplate.getForEntity("http://localhost:8080/api/v1/employees/get/" + id, Employee.class);
		Employee emp = response.getBody();
		
		log.info("get employee by id " + id);
		log.debug("Employee " + emp);
		
		assertNotNull(emp);
	}

	@Test
	void testGetAllEmployee() {
		
	}

}
