package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.ServiceImpl.TradeDayNotFound;

@ControllerAdvice
public class ExceptionHandlerController extends  ResponseEntityExceptionHandler{

	private static final Logger logger = LoggerFactory.getLogger(TradeDayNotFound.class);

	@ExceptionHandler(TradeDayNotFound.class)
	public  @ResponseBody ResponseEntity handleTradeDayNotFound(WebRequest request, TradeDayNotFound ex){
		//logger.error("Requested URL="+request.getRequestURL());
		logger.error("Exception Raised="+ex);
		ex.printStackTrace();
	  return handleExceptionInternal(ex, "Trade day not found", null, HttpStatus.BAD_REQUEST, request);
	    
	}	
}
