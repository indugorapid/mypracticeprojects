package com.example.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.StockPrice;
@Repository
public interface StockRepository extends CrudRepository<StockPrice, Integer>{

	//void save(StockPrice stockPrice1);
	
    public StockPrice findByStocknameAndDate(String stockprice, String date);


}
