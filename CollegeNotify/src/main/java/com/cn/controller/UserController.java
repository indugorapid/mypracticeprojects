package com.cn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cn.model.User;
import com.cn.repository.UserRepository;
import com.cn.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value ="/user" ,method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User createUser(@RequestBody User user) {
		return userService.saveUpdateUser(user);
	}
	
	@RequestMapping(value ="/user" ,method = RequestMethod.GET)
	@ApiOperation(value = "Find student by id",
    notes = "Also returns a link to retrieve all students with rel - all-students")
	public List getAllUser() {
		return (List) userService.getAllUsers();
	}
	
	@RequestMapping(value ="/user" ,method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user) {
		return  userService.saveUpdateUser(user);
	}
	
	@RequestMapping(value ="/user/{id}" ,method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable int id) {
		userService.deleteUserById(id);
	}
}
