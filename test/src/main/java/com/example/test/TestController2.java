package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/test1")
public class TestController2 {

	@GetMapping(value= " /v2/3")
	public String getHello()
	{
		return "Heelloooo 3 I am here";
	}
	
	@GetMapping(value= " /v2/4")
	public String getHello2()
	{
		return "Heelloooo 4 I am here";
	}
	
}
