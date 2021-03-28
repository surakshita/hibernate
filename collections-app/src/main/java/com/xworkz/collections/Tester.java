package com.xworkz.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		String contextConfiguration = "application.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfiguration);

		// ListCollection listCollection=applicationContext.getBean(ListCollection.class);
		// System.out.println( listCollection.getCountry());
		
		System.out.println("********");
		 MapCollection mapCollection= applicationContext.getBean(MapCollection.class);
		 System.out.println(mapCollection.getMovies());

		// SetCollection set= applicationContext.getBean(SetCollection.class);
		// System.out.println("wonders of the world:"+set.getWondersOfWorld());

	}

}
