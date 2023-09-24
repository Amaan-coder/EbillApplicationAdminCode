package com.example.ebill.dto;

import java.io.Serializable;

public class ResponseDto implements Serializable{
	
	private static final long serialVersionUID = 1;
    private Object response;
    private boolean errFlag;
    private boolean warnFlag;
    private String message;
    private int statusCode;
    
	public ResponseDto(boolean errFlag, String message) {
		super();
		this.errFlag = errFlag;
		this.message = message;
	}

	public ResponseDto(boolean errFlag, int statusCode,String message ) {
		super();
		this.errFlag = errFlag;
		this.message = message;
		this.statusCode = statusCode;
	}

	public ResponseDto(boolean errFlag, int statusCode) {
		super();
		this.errFlag = errFlag;
		this.statusCode = statusCode;
	}

	public ResponseDto(int statusCode, boolean warnFlag) {
		super();
		this.warnFlag = warnFlag;
		this.statusCode = statusCode;
	}

	public ResponseDto(boolean errFlag, boolean warnFlag, String message) {
		super();
		this.errFlag = errFlag;
		this.warnFlag = warnFlag;
		this.message = message;
	}

	public ResponseDto(Object response, int statusCode) {
		super();
		this.response = response;
		this.statusCode = statusCode;
	}

	public ResponseDto(Object response) {
		super();
		this.response = response;
	}

	public ResponseDto() {
		super();
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

	public boolean isErrFlag() {
		return errFlag;
	}

	public void setErrFlag(boolean errFlag) {
		this.errFlag = errFlag;
	}
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isWarnFlag() {
		return warnFlag;
	}

	public void setWarnFlag(boolean warnFlag) {
		this.warnFlag = warnFlag;
	}


	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}