package com.xworkz.headphone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		
		String contextConfiguration="application.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(contextConfiguration);
		HeadPhone headPhone=applicationContext.getBean(HeadPhone.class);
		System.out.println(headPhone.getBrand());
		System.out.println(headPhone.getPrice());
		System.out.println(headPhone.getColor());
		

	}

}
