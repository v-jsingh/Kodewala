package com.blinkit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blinkit.entity.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

	ProductEntity findProductByProductName(String input);
	
  //basic crud operation keep this emty
}
