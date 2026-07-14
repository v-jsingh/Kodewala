package com.example.demo.service;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OTPEntity;
import com.example.demo.repository.OTPRepository;
import com.example.demo.response.OTPResponse;

@Service
public class OTPService {
	@Autowired
	OTPRepository otpRepository;
	
	public OTPResponse saveOtp(String mobile,String name)
	{
		OTPEntity entity=new OTPEntity();
		entity.setOtp(generateOtp());
		entity.setStatus("active");
		entity.setMobile(mobile);
		entity.setName(name);
		
		
		
		
	OTPEntity response=otpRepository.save(entity);
	if(response.getId()>0)
	{
		System.out.println("OTP saved succesfully");
	}
	else
		System.out.println("unable to save"); 
	
	OTPResponse otpResponse=new OTPResponse();
	otpResponse.setOtp(response.getOtp());
	otpResponse.setStatus(response.getStatus());
	otpResponse.setValid("5 mins");
	
			return otpResponse;
	
	}
	public int generateOtp()
	{
		SecureRandom random=new SecureRandom();
		int otp=10000+random.nextInt(90000);
		return otp;
		
	}
	
	
	

}
