package com.xworkz.balloon.dto;

import org.springframework.stereotype.Component;

@Component
public class BalloonDTO {

	public BalloonDTO() {
		
		System.out.println("invoked balloon dto");
		System.out.println(this.getClass().getSimpleName()+":object created");
	}

	
}
