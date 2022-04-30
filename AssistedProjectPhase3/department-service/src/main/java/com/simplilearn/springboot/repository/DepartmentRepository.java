package com.simplilearn.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.springboot.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	

}
