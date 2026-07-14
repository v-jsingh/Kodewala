package com.blinkit.productcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blinkit.orderservice.OrderService;
import com.blinkit.request.ProductRequest;

@Controller
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("saveProduct")
	@ResponseBody
	public String uploadProduct(@ModelAttribute ProductRequest request)
	{
		long productId=orderService.createProduct(request);
		return "Product has been uploaded and product id is"+productId;
	}

}
