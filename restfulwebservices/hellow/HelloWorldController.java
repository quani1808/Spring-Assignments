package com.in28minutes.rest.webservices.restfulwebservices.hellow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.Assignment1.HellWorldBean;


@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HellWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HellWorldBean(String.format("Hello World, %s", name));
	}

}
