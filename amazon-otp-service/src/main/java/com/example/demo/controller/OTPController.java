package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.OTPRequest;
import com.example.demo.response.OTPResponse;
import com.example.demo.service.OTPService;

@RestController//controller and response body 
@RequestMapping("otp")
public class OTPController {
      
	@Autowired
	OTPService otpService;
	
	@PostMapping("/generate")
	public  OTPResponse generateOtp(@RequestBody OTPRequest otpRequest)
	{
		String name=otpRequest.getName();
	    String mobile=otpRequest.getMobile();
	    OTPResponse otpResponse=otpService.saveOtp(mobile, name);
	    return otpResponse;
		
		
	

}
}

