package com.amazon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
	@GetMapping("viewProductPage")    //we are reading something
	public String displayProductPage()
	{
		System.out.println("ProductController.displayProductPage");
		return "product-search";  //productsearch->
	}
	
	
	@GetMapping("searchProduct")
	@ResponseBody
	public String searchProducts(@RequestParam("searchText") String inputString)
	{
		System.out.println("ProductController.displayProductPage()");
		return "Iphone 17 pro max aukaat ke baahar";
	}
	
	
	
	

}
