package com.in28minutes.rest.webservices.restfulwebservices.Assignments7;

public class OrderDetails 
{
	    private Integer OrderId;
	    private String OrderName;
	    private Double OrderPrice;
	    public OrderDetails(Integer orderId, String orderName, Double orderPrice) 
	    {
	        super();
	        OrderId = orderId;
	        OrderName = orderName;
	        OrderPrice = orderPrice;
	    }
	    
	    public Integer getOrderId() 
	    {
	        return OrderId;
	    }
	    public void setOrderId(Integer orderId) 
	    {
	        OrderId = orderId;
	    }
	    public String getOrderName() 
	    {
	        return OrderName;
	    }
	    public void setOrderName(String orderName) 
	    {
	        OrderName = orderName;
	    }
	    public Double getOrderPrice() 
	    {
	        return OrderPrice;
	    }
	    public void setOrderPrice(Double orderPrice) 
	    {
	        OrderPrice = orderPrice;
	    }
	    
	    @Override
	    public String toString() 
	    {
	        return "OrderDetails [OrderId=" + OrderId + ", OrderName=" + OrderName + ", OrderPrice=" + OrderPrice + "]";
	    }

}
