package com.cn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cn.model.College;
import com.cn.model.User;

@Repository
public interface CollegeRepository extends CrudRepository<College, Integer>{

	
}



