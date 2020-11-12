package com.csdn.cloud.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderUserInfoController {

	@RequestMapping("/getUserInfo")
	public Object getUserInfo(@RequestParam("userId") String userId) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("id", userId);
		map.put("userName", "越");
		map.put("gender", "女");
		
		return map;
	}
}
