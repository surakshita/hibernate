package com.xworkz.balloon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		String contextConfigLocation = "application.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(contextConfigLocation);

		Balloon balloon = context.getBean(Balloon.class);
		System.out.println("shape :" + balloon.getShape());
		System.out.println("color :" + balloon.getColor());
		balloon.usedToDecorate();

	}

}
