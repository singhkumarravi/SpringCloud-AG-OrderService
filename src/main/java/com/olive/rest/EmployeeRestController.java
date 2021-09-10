package com.olive.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
class OrderRestController {
	
    @Value("${server.port}")
	private String port;
    
    @GetMapping("/data")
	public String show() {
		return "Order SuccessFull With Port => " + port;
	}
}
