package com.hrms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.model.Employee;
import com.hrms.model.Employeenotfoundexception;
import com.hrms.repository.EmployeeRepository;


@RestController
public class EmployeeController {
	
@Autowired
EmployeeRepository employeeRepository;

//create
@RequestMapping(value = "/employee" , method = RequestMethod.POST)
public Employee createEmployee(@RequestBody Employee employee) {
	return employeeRepository.save(employee);
}

//Read
@RequestMapping(value = "/employee/{id}" , method = RequestMethod.GET)
public Employee getEmployeeById(@PathVariable int id) {
	Optional<Employee> employee = employeeRepository.findById(id);
	if (employee == null)
		throw new Employeenotfoundexception("USER_0001","User Not found"
				+ "");

	return employee.get();
}

@RequestMapping(value = "/employee" , method = RequestMethod.GET) 
	public List getAllEmployees() {
		return (List)employeeRepository.findAll();
	}

//update
@RequestMapping(value = "/employee" , method = RequestMethod.PUT) 
	public Employee updateEmployee(@RequestBody Employee employee) {
	  return employeeRepository.save(employee);

}

//delete
@RequestMapping(value = "/employee/{id}" , method = RequestMethod.DELETE) 
   public void  deleteEmployee(@PathVariable int id) {
	 employeeRepository.deleteById(id);
	
}

}
