package com.in28minutes.rest.webservices.restfulwebservices.helloworld.Assignment1;

public class HellWorldBean {
	
	private String message;
	
	public HellWorldBean(String message) {
		// TODO Auto-generated constructor stub
	   this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HellWorldBean [message=" + message + "]";
	}
	
	

}
