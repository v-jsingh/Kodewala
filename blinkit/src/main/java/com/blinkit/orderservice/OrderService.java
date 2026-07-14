package com.blinkit.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blinkit.entity.CategoryEntity;
import com.blinkit.entity.ProductEntity;
import com.blinkit.repository.ProductRepository;
import com.blinkit.request.ProductRequest;

@Service
public class OrderService {
	@Autowired
	ProductRepository productRepository;
	public long createProduct(ProductRequest productRequest)
	{
		ProductEntity entity=new ProductEntity();
		
		entity.setBrand(productRequest.getBrand());
		entity.setPrice(productRequest.getPrice());
		entity.setProductName(productRequest.getProductName());
		entity.setQuantity(productRequest.getQuantity());
		
		CategoryEntity categoryEntity=new CategoryEntity();
		categoryEntity.setCategory(productRequest.getCategory());
		categoryEntity.setStatus("active");
	
		//this will create a record in table
		ProductEntity responseEntity=productRepository.save(entity);
		long productId=responseEntity.getProductId();
		if(productId>0)
		{
			System.out.println("Product has been created and product id is "+responseEntity.getProductId());
		}
		else
			System.out.println("unable to create");
		
		return productId; 
	}
	
	public String searchProduct(String inputString)
	{
		String response=null;
		ProductEntity products=productRepository.findProductByProductName(inputString);
		response=products.getProductName()+ " , "+products.getProductId()+" "+products.getQuantity()+" ";
		return response;
	}


}
