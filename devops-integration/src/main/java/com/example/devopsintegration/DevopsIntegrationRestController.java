package com.example.devopsintegration;

import org.springframework.web.bind.annotation.GetMapping;

public class DevopsIntegrationRestController {

	@GetMapping("/hello")
	public String printHello() {
		return "Hello";
	}
}
