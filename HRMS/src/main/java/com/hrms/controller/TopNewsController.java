package com.hrms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hrms.model.News;
import com.hrms.service.NewsService;

@Controller
public class TopNewsController {

	@Autowired
	  private NewsService newsService;


	  @RequestMapping(value = "/news", method = {RequestMethod.GET})
	  
	  @ResponseBody
	  public  News getData() {
		  
		
	      return newsService.getNews(); // inside the service you handle the response.
	  }
	  
	 
	  }

	

