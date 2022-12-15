package com.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.model.Customer;
import com.grocery.model.Product;
import com.grocery.repository.ProductRepository;
import com.grocery.service.ProductService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/product")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		return new  ResponseEntity<Product>(productService.addProduct(product),HttpStatus.OK);	
	}
	
	//1)GET all products
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts(){
		return new ResponseEntity<List<Product>>(productService.getAllProducts(),HttpStatus.OK);		
	}
	
	//2)GET all products by productCategory
	@GetMapping("/productsCategory/{productName}")
	public ResponseEntity<List<Product>> getAllByProductName(@PathVariable String productName){
		return new ResponseEntity<List<Product>>(productService.getAllByProductName(productName),HttpStatus.OK);				
	}
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		return new  ResponseEntity<Customer>(productService.addCustomer(customer),HttpStatus.OK);	
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return new ResponseEntity<List<Customer>>(productService.getAllCustomers(),HttpStatus.OK);		
	}
	
	@PostMapping("/addtocart/{customerUsername}")
	public Customer addToCart(@PathVariable String customerUsername,@RequestBody Product product){
		
		return null;
		
	}
	
	
	
	
	

	
	

	
	
}
