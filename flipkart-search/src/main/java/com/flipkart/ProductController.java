package com.flipkart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
	
	@GetMapping("viewProductPage")//used to retreive data from the server
	public String displayProductPage()  
	{
		System.out.println("Product Control Display product Page");
		return "product-search";
	}	
		@GetMapping("searchProduct")
		@ResponseBody
	
		public String searchProducts(@RequestParam("searchText")String inputString)
		{
			System.out.println("Searching the product for String :"+inputString);
			return "iphone 17 pro max ";
		}
		
	}
	


