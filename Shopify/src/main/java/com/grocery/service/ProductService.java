package com.grocery.service;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;

import com.grocery.model.Customer;
import com.grocery.model.Product;



public interface ProductService {
	//addProduct
	public Product addProduct(Product product);
	//getAllProducts
	public List<Product> getAllProducts();

	public List<Product> getAllByProductName(String productName);
	
	
	public Customer addCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	
	public Customer addToCart(String customerUsername,Product product);
	
	

}
