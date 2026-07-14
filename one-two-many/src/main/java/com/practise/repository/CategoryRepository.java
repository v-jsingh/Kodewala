package com.practise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practise.entity.CategoryEntity;


@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {
	
	public CategoryEntity findByCategory(String input);
	
	@Query("select c FROM CategoryEntity c JOIN FETCH c.product")
	
	public List<CategoryEntity> findAllCategories();
	

}
