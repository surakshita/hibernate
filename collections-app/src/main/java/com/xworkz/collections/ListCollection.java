package com.xworkz.collections;

import java.util.List;


public class ListCollection {
	
	private List<String> country;
	
	
	

	public ListCollection(List<String> country) {
		super();
		this.country = country;
	}




	public void countryList() {
		System.out.println("invoked country list");
	}




	public List<String> getCountry() {
		return country;
	}
	
	
	
	

}
