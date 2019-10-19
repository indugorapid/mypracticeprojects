package com.cn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cn.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	
	User findByEmail(String emailId);
}
