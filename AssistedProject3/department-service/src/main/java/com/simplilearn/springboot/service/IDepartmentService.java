package com.simplilearn.springboot.service;

import com.simplilearn.springboot.dto.DepartmentDTO;
import com.simplilearn.springboot.entity.Department;

public interface IDepartmentService {
	
	public Department addDepartment(DepartmentDTO departmentDTO);
	public Department getDeptById(long id);

}
