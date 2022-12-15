package com.grocery.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.grocery.model.Customer;
import com.grocery.model.Product;

public interface CustomerRepository extends MongoRepository<Customer, String> {
	
	  @Query("{customerUsername : ?0,}")                                         // SQL Equivalent : SELECT * FROM BOOK where author = ?
      public List<Product> getProductsByCategoryR(String productCategory);

}
