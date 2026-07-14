package com.instamart.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)	
	private String product_id;
	private String product_name;
	private String price;
	private String quantity;
	
	@ManyToOne 
	@JoinColumn(name="category_id")
	private CategoryEntity category;

	public CategoryEntity getCategory()
	{
		return category;
	}

	public void setCategory(CategoryEntity category)
	{
		this.category = category;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	

}
