package com.simplilearn.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.simplilearn.userservice.dto.UserDTO;
import com.simplilearn.userservice.entity.User;
import com.simplilearn.userservice.repository.UserRepository;
import com.simplilearn.userservice.vo.Department;
import com.simplilearn.userservice.vo.UserDepartmentVO;

@Service
public class UserServiceImp implements IUserService{
	
	@Autowired
	UserRepository repo;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public User addUser(UserDTO userDTO) {
		User user = new User();
		user.setUsername(userDTO.getUsername());
		user.setEmail(userDTO.getEmail());
		user.setDepartmentId(userDTO.getDepartmentId());
		return repo.save(user);
	}

	@Override
	public User getUserById(long id) {
		return repo.findById(id).orElse(new User());
	}

	@Override
	// It will take user from repository and it takes department from department microservice
	public UserDepartmentVO getUserByIdWithDepartment(long userId) {
		// Get user by id from local repo
		User user = this.getUserById(userId); // calling getUserById from current service class
		long deptId = user.getDepartmentId();
		
		// Get dept from dept microservice
		ResponseEntity<Department> responseEntity = restTemplate.getForEntity("http://localhost:8181/v1/department/get/" + deptId, Department.class);
		Department department = responseEntity.getBody();
		UserDepartmentVO userDepartmentVO = new UserDepartmentVO(user,department);
		return userDepartmentVO;
	}

}
