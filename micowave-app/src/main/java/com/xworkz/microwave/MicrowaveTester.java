package com.xworkz.microwave;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MicrowaveTester {

	public static void main(String[] args) {
		
		//start framework
		String stringXml="spring.xml";
		ApplicationContext container=new ClassPathXmlApplicationContext(stringXml);
		//to get the object
		Microwave microwave=container.getBean(Microwave.class);
		microwave.startAndStop();
		microwave.temperatureSetting();
		microwave.timer();

	}

}
