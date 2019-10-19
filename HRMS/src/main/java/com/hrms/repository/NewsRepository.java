package com.hrms.repository;

import org.springframework.data.repository.CrudRepository;

import com.hrms.model.Article;
import com.hrms.model.Employee;

public interface NewsRepository extends CrudRepository<Article, Integer>{

}
