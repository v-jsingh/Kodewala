 package com.instamart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.instamart.entity.CategoryEntity;
import com.instamart.entity.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity,Long>
{
	
	public ProductEntity findProductByProductName(String input);

	
	

}
