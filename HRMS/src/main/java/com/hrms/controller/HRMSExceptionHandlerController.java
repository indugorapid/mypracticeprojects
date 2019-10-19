package com.hrms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.hrms.dto.ErrorDTO;
import com.hrms.model.Employeenotfoundexception;


@ControllerAdvice
public class HRMSExceptionHandlerController extends  ResponseEntityExceptionHandler{
   
	private static final Logger logger = LoggerFactory.getLogger(HRMSExceptionHandlerController.class);
	
	@ExceptionHandler(Employeenotfoundexception.class)
	public  @ResponseBody ResponseEntity handleEmployeeNotFoundException(WebRequest request, Employeenotfoundexception ex){
		//logger.error("Requested URL="+request.getRequestURL());
		logger.error("Exception Raised="+ex);
		ex.printStackTrace();
		ErrorDTO bo= new ErrorDTO();
		bo.setMessage(ex.getMessage());
	  return handleExceptionInternal(ex, bo, null, HttpStatus.BAD_REQUEST, request);
	    
	}	
	
	@ExceptionHandler(Exception.class)
	public  @ResponseBody ResponseEntity handleGenericException(WebRequest request, Exception ex){
		//logger.error("Requested URL="+request.getRequestURL());
		logger.error("Exception Raised="+ex);
		ex.printStackTrace();
		ErrorDTO bo= new ErrorDTO();
		bo.setError("Server error. Please try after sometime.");
		  return  handleExceptionInternal(ex, bo, null, HttpStatus.BAD_REQUEST, request);
			
	}	
}
