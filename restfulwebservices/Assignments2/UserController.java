package com.in28minutes.rest.webservices.restfulwebservices.Assignments2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/users/{username}/{password}")
	
	    public String validateUser(@PathVariable String  username,@PathVariable String password){
		
	        if(username.equals("Rani")&&password.equals("Rani123"))
	             return "Valid User";
	        else
	            return "Invalid User";
	 }
}
