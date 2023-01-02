package com.in28minutes.rest.webservices.restfulwebservices.Assignments7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class OrderService 
{
	private static List<OrderDetails> details= new ArrayList<>();
	private static int idcount=200;
	static 
	{
	   details.add(new OrderDetails(++idcount,"smart watch",3027.0));
	   details.add(new OrderDetails(++idcount,"HeadSet",2085.0));
	   details.add(new OrderDetails(++idcount,"Mobile",20000.0));
	}
	public List<OrderDetails> findAll()
	{
	      return details;
	}
	public OrderDetails save(OrderDetails OD)
	{
	    OD.setOrderId(++idcount);
	    details.add(OD);
        return OD;
	}
	public OrderDetails findOne(int id)
	{
		Predicate<? super OrderDetails> predicate = user -> user.getOrderId().equals(id);
	    return details.stream().filter(predicate).findFirst().orElse(null);
	}
	public void deleteById(int id) 
	{
        Predicate<? super OrderDetails> predicate = user -> user.getOrderId().equals(id);
	    details.removeIf(predicate);
	}
	public void  updateById(int id, OrderDetails od) 
	{
    for(int i=0; i<details.size(); i++)
	   {
	    OrderDetails od1=details.get(i);
	    if(od1.getOrderId().equals(id))
	       {
	           details.set(i, od);
	           return;
	       }
	    }
	 }
}
