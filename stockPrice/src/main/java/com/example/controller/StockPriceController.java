package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.StockPrice;
import com.example.model.TimeSeries;
import com.example.service.StockService;

@Controller
public class StockPriceController {

	@Autowired
	  private StockService stockService;

	
	  @RequestMapping(value = "/timeseries/{stockName}/{date}", method = {RequestMethod.GET},headers = "Accept=application/json")
	  @ResponseBody
	  public  StockPrice gettimeseries(@PathVariable("stockName") String deptName,@PathVariable("date") String date) {
		  return stockService.gettimeseries(deptName,date); // inside the service you handle the response.
	  }
	  
}
