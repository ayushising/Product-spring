package com.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.model.Customer;
import com.grocery.model.Product;
import com.grocery.repository.CustomerRepository;
import com.grocery.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Product addProduct(Product product) {
		productRepository.save(new Product(product.getProductId(),product.getProductUrl(),product.getProductName(),product.getProductPrice(),product.getDiscountPrice(),product.getProductDescription(), product.getProductQuantity()));
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> getAllByProductName(String productName) {
	
		return productRepository.getProductsByName(productName);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		customerRepository.save(new Customer(customer.getCustomerUsername(),customer.getCustomerPassword(),customer.getCustomerCart()));
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}

	@Override
	public Customer addToCart(String customerUsername, Product product) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

   

	

	
	

}
