package com.in28minutes.rest.webservices.restfulwebservices.Assignments3;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ZipCodeDetails {
	
	 private String city;
	    private  String state;
	    private String country;
	    @JsonIgnore
	    private Integer zipcode;
	    
	    public ZipCodeDetails(String city, String state, String country, Integer zipcode) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipcode = zipcode;
		}
	    
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public Integer getZipcode() {
			return zipcode;
		}

		public void setZipcode(Integer zipcode) {
			this.zipcode = zipcode;
		}
		

		@Override
		public String toString() {
			return "ZipCodeDetails [city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
		}
}
