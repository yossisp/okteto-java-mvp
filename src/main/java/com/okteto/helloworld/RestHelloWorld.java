package com.okteto.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloWorld {
	private final String test = "test";
	private static final String test2 = "test2";
	
	@GetMapping("/")
	public String sayHello(@RequestParam String name) {
		int num = 44;
		return "Hello world22!";
	}
}