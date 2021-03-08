package com.xworkz.flight.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.flight.dto.FlightDTO;

public class FlightDAOImpl implements FlightDAO {

	@Override
	public void saveFlight(FlightDTO flightDTO) {
		
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(flightDTO);
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		
	}

	@Override
	public void readFlight(int flightId) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		FlightDTO flightDTO=session.get(FlightDTO.class, flightId);
		System.out.println(flightDTO);
		session.close();
		sessionFactory.close();
		
		
	}

	@Override
	public void updateFlight(int flightId) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		FlightDTO flightDTO=session.get(FlightDTO.class, flightId);

		flightDTO.setFlightName("GO AIR");
		Transaction transaction=session.beginTransaction();
		session.update(flightDTO);
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		
	}

	@Override
	public void deleteFlight(int flightId) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		FlightDTO flightDTO=session.get(FlightDTO.class, flightId);
		Transaction transaction=session.beginTransaction();
		session.delete(flightDTO);
		transaction.commit();
		session.close();
		sessionFactory.close();
		
	}
	


}
