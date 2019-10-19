package com.cn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cn.model.College;
import com.cn.repository.CollegeRepository;
import com.cn.service.CollegeService;


@RestController
public class CollegeController {

	
	@Autowired
	private CollegeService collegeservice;
	
	@RequestMapping(value ="/college" ,method = RequestMethod.POST)
	public College createCollege(@RequestBody College college) {
		return collegeservice.saveUpdateCollege(college);
	}
	
	@RequestMapping(value = "/college",method = RequestMethod.GET)
	public List getAllCollege() {
		return (List) collegeservice.getAllCollege();
	}
	
	@RequestMapping(value ="/college" ,method = RequestMethod.PUT)
	public College updateCollege(@RequestBody College college) {
		return  collegeservice.saveUpdateCollege(college);
	}
	
	@RequestMapping(value ="/college/{id}" ,method = RequestMethod.DELETE)
	public void deleteCollege(@PathVariable int id) {
		collegeservice.deleteCollegeById(id);
	}
}
