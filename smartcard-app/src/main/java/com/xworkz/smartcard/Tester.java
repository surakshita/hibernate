package com.xworkz.smartcard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		// String contextConfigLocation = "application.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		SetUpBox setUpBox = applicationContext.getBean(SetUpBox.class);
		setUpBox.readTheSmartCard();

		// bean count
		int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
		System.out.println("bean definition count:" + beanDefinitionCount);
		// bean names invoked
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String string : beanDefinitionNames) {
			System.out.println(string.toString());
		}
		// closing container
		ClassPathXmlApplicationContext container = (ClassPathXmlApplicationContext) applicationContext;
		container.close();
	}

}
