package com.example.ebill.exception;

public class CustomException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private int status;
	
	
	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public CustomException(String message, int status) {
		super(message);
		this.status= status;
	}
	public CustomException(String message) {
		super(message);
		
	}
	
	public int getStatus() {
		return status;
	}
}
