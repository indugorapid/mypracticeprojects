package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StockPrice {

	@Id
	@GeneratedValue
	@Column(name = "ID")	
    private int id;
	
	@Column(name = "STOCKPRICE")
	private float stockprice;
	

	@Column(name = "STOCKNAME")
	private String stockname;
	
	public String getStockname() {
		return stockname;
	}

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public float getStockprice() {
		return stockprice;
	}

	public void setStockprice(float stockprice) {
		this.stockprice = stockprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name = "DATE")
	private String date;
}
