package com.cn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.model.College;
import com.cn.repository.CollegeRepository;
import com.cn.repository.UserRepository;
import com.cn.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService{

	@Autowired
    CollegeRepository collegeRepository;

	@Override
	public College saveUpdateCollege(College college) {
		// TODO Auto-generated method stub
		return collegeRepository.save(college);
	}

	@Override
	public College getCollegeById(Integer collegeId) {
		// TODO Auto-generated method stub
		return collegeRepository.findById(collegeId).get();
	}

	@Override
	public List<College> getAllCollege() {
		// TODO Auto-generated method stub
		return (List) collegeRepository.findAll();
	}

	@Override
	public void deleteCollegeById(Integer collegeId) {
		// TODO Auto-generated method stub
		collegeRepository.deleteById(collegeId);
	}
	
}
