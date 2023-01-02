package com.in28minutes.rest.webservices.restfulwebservices.Assignments3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipCodeDetailController {
	
	private DetailService empser;
    public ZipCodeDetailController(DetailService empser)
    {
    this.empser=empser;
    }
    @GetMapping("/details/{zipcode}")
    public ZipCodeDetails datail(@PathVariable int zipcode)
    {
        return empser.findOne(zipcode);
    }
}
