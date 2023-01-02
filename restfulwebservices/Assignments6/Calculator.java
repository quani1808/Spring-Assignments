package com.in28minutes.rest.webservices.restfulwebservices.Assignments6;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Calculator {
	@GetMapping("/addition/{num1}/{num2}")
	   public  int add(@PathVariable int num1,@PathVariable int num2)
	    {
	  
	return (num1+num2);
	    }
	      
	@GetMapping("/substraction/{num1}/{num2}")
	public  int   substaction(@PathVariable int num1,@PathVariable int num2)
	{
	return num1-num2;
	}
	@GetMapping("/multiplication/{num1}/{num2}")
	public  int   product(@PathVariable int num1,@PathVariable int num2)
	{
		return num1*num2;
	}
	@GetMapping("/division/{num1}/{num2}")
	public  int   divide(@PathVariable int num1,@PathVariable int num2)
	{
	return num1/num2;
	}
	@GetMapping("/modulous/{num1}/{num2}")



	public  int   mod(@PathVariable int num1,@PathVariable int num2)
	{
	return num1%num2;
	}
	@GetMapping("/squareroot/{num1}")
	public  int   mod(@PathVariable int num1)
	{
	return num1*num1;
	}
	

}
