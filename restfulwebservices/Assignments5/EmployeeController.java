package com.in28minutes.rest.webservices.restfulwebservices.Assignments5;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	private EmployeeService ser;
	public EmployeeController(EmployeeService ser)
	{
		this.ser=ser;
	}
	@GetMapping("/employee")
	public List<EmployeeDetails> retrieveAllUser(){
		return ser.findAll();
	}

	@PostMapping("/employee")
	public EmployeeDetails createUsers(@RequestBody EmployeeDetails emp2) {
	return ser.saves(emp2);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable int id){
		ser.deleteByempId(id);
	}
	@GetMapping("/employee/{id}")
	public EmployeeDetails findone(@PathVariable int id){
		return ser.findOne(id);
	}
	@PutMapping("/employee/{id}")
	public EmployeeDetails putEmployee(@PathVariable int id) {
	return ser.findOne(id);
	}
}

