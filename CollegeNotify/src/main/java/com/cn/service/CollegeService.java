package com.cn.service;

import java.util.List;

import com.cn.model.College;
import com.cn.model.User;

public interface CollegeService {
    College saveUpdateCollege(College college);
	
	List<College> getAllCollege();
	
	void deleteCollegeById(Integer collegeId);

	College getCollegeById(Integer collegeId);
}
