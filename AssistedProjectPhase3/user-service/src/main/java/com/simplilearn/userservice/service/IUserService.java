package com.simplilearn.userservice.service;

import com.simplilearn.userservice.dto.UserDTO;
import com.simplilearn.userservice.entity.User;
import com.simplilearn.userservice.vo.UserDepartmentVO;

public interface IUserService {
	public User addUser(UserDTO userDTO);
	public User getUserById(long id);
	public UserDepartmentVO getUserByIdWithDepartment(long userId);

}
