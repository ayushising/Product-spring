package com.grocery.exceptions;

import java.time.LocalDateTime;

public class ErrorInfo {
	private String ErrorInfo;
	private String HttpStatus;
	private LocalDateTime dateTime;
	public String getErrorInfo() {
		return ErrorInfo;
	}
	public void setErrorInfo(String errorInfo) {
		ErrorInfo = errorInfo;
	}
	public String getHttpStatus() {
		return HttpStatus;
	}
	public void setHttpStatus(String httpStatus) {
		HttpStatus = httpStatus;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public ErrorInfo(String errorInfo, String httpStatus, LocalDateTime dateTime) {
		super();
		ErrorInfo = errorInfo;
		HttpStatus = httpStatus;
		this.dateTime = dateTime;
	}
	public ErrorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

}



