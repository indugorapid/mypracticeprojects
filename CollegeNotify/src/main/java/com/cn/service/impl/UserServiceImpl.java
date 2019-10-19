package com.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.exception.DuplicateUserFoundException;
import com.cn.model.College;
import com.cn.model.User;
import com.cn.repository.CollegeRepository;
import com.cn.repository.UserRepository;
import com.cn.service.UserService;

@Service
public  class UserServiceImpl implements UserService  {

	@Autowired
     UserRepository userRepository;
	
	@Override
	public User saveUpdateUser(User user) {
		User dbUser = userRepository.findByEmail(user.getEmail());
		if(dbUser!=null) {
			throw new DuplicateUserFoundException("Email Id Already Exists");
		}
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Integer id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return (List) userRepository.findAll();
	}
	
	public void deleteUserById(Integer id) {
		
		userRepository.deleteById(id);
	}

}
