package com.xworkz.smartcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetUpBox {
	@Autowired
	@Qualifier("sundirect")
	private SmartCard smartCard;

	public SetUpBox() {
		super();
		System.out.println(this.getClass().getSimpleName()+":object created");
	}
	
	public void readTheSmartCard() {
		smartCard.connect();
	}

}
