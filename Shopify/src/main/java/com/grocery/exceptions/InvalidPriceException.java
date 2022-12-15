package com.grocery.exceptions;

public class InvalidPriceException extends RuntimeException{
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
				this.msg = msg;
	}

}
