package com.simplilearn.userservice.vo;

import com.simplilearn.userservice.entity.User;

public class UserDepartmentVO {
	private User user;
	private Department department;

	public UserDepartmentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDepartmentVO(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
