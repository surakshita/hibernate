package com.xworkz.smartcard;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sundirect")
public class SunDirect implements SmartCard{
	
	
	

	public SunDirect() {
		super();
		System.out.println(this.getClass().getSimpleName()+":object created");
	}

	@Override
	public void connect() {
		System.out.println("sun direct connected");
		
	}

}
