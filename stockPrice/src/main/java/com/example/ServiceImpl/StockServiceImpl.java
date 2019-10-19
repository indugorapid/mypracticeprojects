package com.example.ServiceImpl;

import java.util.Optional;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.controller.StockPriceController;
import com.example.model.StockPrice;
import com.example.model.TimeSeries;
import com.example.repository.StockRepository;
import com.example.service.StockService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	public StockRepository stockRepository;

	public static final String REST_SERVICE_URI = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol={@stockName}&apikey=demo";

	public StockPrice gettimeseries(String stockSymbol, String date) {
		System.out.println("Testing getUser API----------");

		StockPrice stock=stockRepository.findByStocknameAndDate(stockSymbol, date);

		if (stock != null) {
			return stock;
		} else {

			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.set("Content-Type", "application/json");

			HttpEntity entity = new HttpEntity(headers);
			String temp = REST_SERVICE_URI.replace("{@stockName}", stockSymbol);
			ResponseEntity<String> response = restTemplate.exchange(temp, HttpMethod.GET, entity, String.class);
			System.out.println(temp);

			float StockPrice = 0;
			JSONObject jsonObject = new JSONObject(response.getBody());
try {
			 StockPrice = jsonObject.getJSONObject("Time Series (Daily)").getJSONObject(date).getFloat("1. open");
}  catch(JSONException noJsonObject){throw new TradeDayNotFound();}
			StockPrice stockPrice1 = new StockPrice();
			stockPrice1.setStockprice(StockPrice);
			stockPrice1.setDate(date);
			stockPrice1.setStockname(stockSymbol);
			stockRepository.save(stockPrice1);
			// stockRepository.

			return stockPrice1;
//	 System.out.println(jsonObject.getJSONObject("Time Series (Daily)").getJSONObject("2019-04-29").get("1. open"));

		}
	}
}
