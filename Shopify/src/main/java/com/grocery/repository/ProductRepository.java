package com.grocery.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.grocery.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
	  @Query("{productCategory : ?0}")                                         // SQL Equivalent : SELECT * FROM BOOK where author = ?
      public List<Product> getProductsByCategoryR(String productCategory);
	  
	  @Query("{productName : ?0}")                                         // SQL Equivalent : SELECT * FROM BOOK where author = ?
      public List<Product> getProductsByName(String productName);

	  
	  
	  
	  

}
