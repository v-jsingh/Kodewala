package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zepto.orderservice.OrderService;
import com.zepto.request.OrderRequest;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@PostMapping("placeOrder")
	public String placeOrder(@ModelAttribute OrderRequest orderRequest)//used to bind web request data into java object
	{
		System.out.println("OrderController Item : "+orderRequest.getItemName());
		System.out.println("OrderController Qty : "+orderRequest.getQty());
		System.out.println("OrderController Price : "+orderRequest.getPrice());
		
		orderService.createOrder(orderRequest);
		
		return "order-response-page";
	}
	
	
	

}
