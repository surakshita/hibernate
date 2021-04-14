package com.xworkz.restaurants;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xworkz.restaurants.dao.RestaurantsDaoImpl;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		RestaurantsDaoImpl dao = (RestaurantsDaoImpl) context.getBean(RestaurantsDaoImpl.class);

		//RestaurantsDto dto=new RestaurantsDto(6, "Alto vino", "Pune");
		//dao.insertRestaurantsDetail(dto);

		// update

		dao.updateNameById("Spice kitchen", 1);

		// delete
		dao.deleteById(6);

		ClassPathXmlApplicationContext container = (ClassPathXmlApplicationContext) context;
		container.close();

		/*
		 * Restaurants dto=new Restaurants(); dto.setId(1); dto.setName("xyz");
		 * dto.setLocation("gulbarga"); dao.insert(dto);
		 */

	}

}
