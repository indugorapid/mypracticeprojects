package com.example.service;

import com.example.model.StockPrice;
import com.example.model.TimeSeries;

public interface StockService {
	

	public StockPrice gettimeseries(String stockSymbol, String date); 
		
}
	