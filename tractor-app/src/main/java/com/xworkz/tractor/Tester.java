package com.xworkz.tractor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.tractor.dao.TractorDAO;
import com.xworkz.tractor.dto.TractorDTO;

public class Tester {

	public static void main(String[] args) {
		
		String contextConfigLocation="application.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(contextConfigLocation);
		TractorDAO tractorDAO=context.getBean(TractorDAO.class);
		TractorDTO tractorDTO=new TractorDTO("mahindra", "green", 500000, 20);
		tractorDAO.saveTractor(tractorDTO);

	}

}
