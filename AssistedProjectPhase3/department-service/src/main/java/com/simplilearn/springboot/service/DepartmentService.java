package com.simplilearn.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.springboot.dto.DepartmentDTO;
import com.simplilearn.springboot.entity.Department;
import com.simplilearn.springboot.repository.DepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService {
	
	@Autowired
	DepartmentRepository repo;

	@Override
	public Department addDepartment(DepartmentDTO departmentDTO) {
		Department dept = new Department();
		dept.setDepartmentName(departmentDTO.getDepartmentName());
		dept.setDepartmentAddress(departmentDTO.getDepartmentAddress());
		dept.setDepartmentCode(departmentDTO.getDepartmentCode());
		return repo.save(dept);
	}

	@Override
	public Department getDeptById(long id) {
		
		return repo.findById(id).orElse(new Department());
	}
	

}
