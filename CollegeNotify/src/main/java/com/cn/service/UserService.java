package com.cn.service;

import java.util.List;

import com.cn.model.College;
import com.cn.model.User;

public interface UserService {
	
	User saveUpdateUser(User user);
	
	User getUserById(Integer userId);
	
	List<User> getAllUsers();
	
	void deleteUserById(Integer userId);
}
