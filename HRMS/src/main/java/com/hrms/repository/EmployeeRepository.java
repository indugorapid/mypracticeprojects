package com.hrms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hrms.model.Employee;



@Repository

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{


}
