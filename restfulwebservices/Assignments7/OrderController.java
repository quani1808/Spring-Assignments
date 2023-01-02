package com.in28minutes.rest.webservices.restfulwebservices.Assignments7;

import java.net.URI;
import java.util.List;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class OrderController 
{
   private OrderService service;
   public OrderController(OrderService service) 
   {
        super();
        this.service = service;
   }
    @GetMapping("/orders")
    public List<OrderDetails> retrieveAllUsers()
    {
        return service.findAll();
    }
    @GetMapping("/orders/{id}")
    public OrderDetails retrieveUser(@PathVariable Integer id )
    {
        return service.findOne(id);
    }
    @PostMapping("/orders")
    public ResponseEntity<Object> createUser(@RequestBody OrderDetails placeOrder)
    {
        OrderDetails OrderPlaced =service.save(placeOrder);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(OrderPlaced.getOrderId())
                .toUri();
        return ResponseEntity.created(location).build();
     }
     @DeleteMapping("/orders/{id}")
     public void deleteOrderDetails(@PathVariable int id) 
     {
        service.deleteById(id);
     }
     @PutMapping("/orders/{id}")
     public void  UpadateOrderDetails(@PathVariable int id, @RequestBody OrderDetails od)
     {
    	 service.updateById(id, od);
     }
}
