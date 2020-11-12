package com.csdn.cloud.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="provider-demo")
public interface ProviderInterface {

	@GetMapping("/provider/getUserInfo")
	public Object getUserInfo(@RequestParam("userId") String userId);
}
