package com.hrms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockPriceController {
	private int totalShares;
	@RequestMapping(value = "/totalShares" , method = RequestMethod.GET) 
	public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }
	private int getCurrentPrice() {
		
		return 0;
	}
	
	public int getTotalShares() {
        return totalShares;
    }
	
	 public void purchase(int shares, double pricePerShare) {
	        totalShares += shares;
	        addCost(shares * pricePerShare);
	    }
	private void addCost(double d) {
		// TODO Auto-generated method stub
		
	}

}
