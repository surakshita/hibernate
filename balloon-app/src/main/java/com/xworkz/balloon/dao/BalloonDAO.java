package com.xworkz.balloon.dao;

import org.springframework.stereotype.Component;

@Component
public class BalloonDAO {

	public BalloonDAO() {
		
		System.out.println("invoked balloon dao");
		System.out.println(this.getClass().getSimpleName()+":object created");
	}
	
	

}
