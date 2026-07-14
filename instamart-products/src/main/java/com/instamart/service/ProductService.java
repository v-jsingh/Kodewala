package com.instamart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instamart.entity.CategoryEntity;
import com.instamart.entity.ProductEntity;
import com.instamart.repository.ProductRepository;
import com.instamart.request.ProductRequest;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	
	public String searchProduct(String inputString)
	{
		String response=null;
		ProductEntity products=productRepository.findProductByProductName(inputString);
		response=products.getProduct_name()+ " , "+products.getProduct_id()+" "+products.getQuantity()+" ";
		return response;
	}
	
	public void createProduct(ProductRequest productRequest)
	{
		ProductEntity productEntity=new ProductEntity();
		productEntity.setProduct_name(productRequest.getProduct_name());
		productEntity.setPrice(productRequest.getPrice());
		productEntity.setQuantity(productRequest.getQuantity());
		
		CategoryEntity categoryEntity=new CategoryEntity();
		categoryEntity.setCategory(productRequest.getCategory());
		categoryEntity.setStatus("Active");
		ProductEntity responseEntity=productRepository.save(productEntity);
		
		
	}
	
	
	

}
 