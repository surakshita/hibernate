package com.xworkz.singleSessionFactory;

import java.util.Objects;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class singleFactory {

	private static SessionFactory sessionFactory = null;

	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		if (Objects.nonNull(sessionFactory)) {
			sessionFactory.close();
			System.out.println("sessionFactory is closed");

		} else {
			System.out.println("sessionFactory is not closed");

		}
	}

}
