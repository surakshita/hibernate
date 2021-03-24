package com.xworkz.microwave;

public class Microwave {

	public Microwave() {
		super();
		System.out.println(this.getClass().getSimpleName()+" :object created");
	}
	
	void startAndStop() {
		System.out.println("invoked start and stop");
	}
	
	void temperatureSetting() {
		System.out.println("invoked temperature setting");
	}
	
	void timer() {
		System.out.println("invoked timer");
	}
	

}
