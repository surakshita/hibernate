package com.xworkz.smartcard;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("airtel")
public class Airtel implements SmartCard {
	
	

	public Airtel() {
		super();
	System.out.println(this.getClass().getSimpleName()+":object created");
	}

	@Override
	public void connect() {
		System.out.println("Airtel is connected");
		
	}

}
