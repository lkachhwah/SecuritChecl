package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/test")
public class TestController {

	@GetMapping(value= " /v1/1")
	public String getHello()
	{
		return "Heelloooo 1 I am here";
	}
	
	@GetMapping(value= " /v1/2")
	public String getHello2()
	{
		return "Heelloooo 2 I am here";
	}
	
}
