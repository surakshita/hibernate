package com.xworkz.balloon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Balloon {
	
	@Value("Round")
	private String shape;
	
	@Value("White")
	private String color;
	public Balloon() {
		super();
		System.out.println(this.getClass().getSimpleName()+":object created");
	}
	
	
	/*public Balloon(@Value("Star") String shape,@Value("Purple") String color) {
		super();
		this.shape = shape;
		this.color = color;
	}*/


	public void usedToDecorate() {
		System.out.println("invoked used to decorate");
	}

	public String getShape() {
		return shape;
	}

	public String getColor() {
		return color;
	}
	//@Value("tearDrop")
	public void setShape(String shape) {
		this.shape = shape;
	}
	//@Value("Golden")
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
