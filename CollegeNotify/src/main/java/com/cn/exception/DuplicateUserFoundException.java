package com.cn.exception;

public class DuplicateUserFoundException extends  RuntimeException{

	public DuplicateUserFoundException(String errorMessage) {
		super(errorMessage);
	}
}
