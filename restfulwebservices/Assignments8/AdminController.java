package com.in28minutes.rest.webservices.restfulwebservices.Assignments8;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	private ProductService service;

	   public AdminController(ProductService service) {
	        this.service = service;
	    }

	   @GetMapping("/Owner")
	   public List<Product> retrieveAll() {
	        return service.findAll();
	    }

       @PostMapping("/Owner")
	    public Product createProduct(@RequestBody Product pro1)
	    {
		   return service.save1(pro1);
	    }
	    @DeleteMapping("/Owner/{id}")
	    public void deleteproduct(@PathVariable int id)
	    {
	        
	        service.deleteById1(id);
	    }
	    @GetMapping("/Owner/{id}")
	    public Product getdeatils1(@PathVariable int id)
	    {
	        
	        return service.findOne1(id);
	            
	    }
	    @PutMapping("/Owner/{id}")
	    public void UpdateDetails(@PathVariable int id, @RequestBody Product p )
	    {
	        service.updateById(id,p);
	    }

}
