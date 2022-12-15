package com.grocery.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	@Id
	private String cId;
	private String customerUsername;
	private String customerPassword;
	private List<Product> customerCart;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerUsername, String customerPassword, List<Product> customerCart) {
		super();
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
		this.customerCart = customerCart;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getCustomerUsername() {
		return customerUsername;
	}
	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public List<Product> getCustomerCart() {
		return customerCart;
	}
	public void setCustomerCart(List<Product> customerCart) {
		this.customerCart = customerCart;
	}
	
	
	
	

}
