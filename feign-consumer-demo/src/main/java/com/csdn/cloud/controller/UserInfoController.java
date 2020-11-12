package com.csdn.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csdn.cloud.interfaces.ProviderInterface;

@RestController
public class UserInfoController {
	
	@Autowired
	private ProviderInterface providerInterface;
	
	@RequestMapping(value="/getUserInfo/{userId}",method= {RequestMethod.GET})
	public Object getUserInfo(@PathVariable String userId) {
		System.out.println(userId);
		return providerInterface.getUserInfo(userId);
	}
}
