package com.xworkz.flight.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.flight.dto.FlightDTO;
import com.xworkz.singleSessionFactory.singleFactory;

public class FlightDAOImpl implements FlightDAO {

	@Override
	public void saveFlight(FlightDTO flightDTO) {
		// SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			SessionFactory sessionFactory = singleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(flightDTO);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				} else {
					System.out.println("session is not closed");

				}
				singleFactory.closeSessionFactory();
			} catch (HibernateException hibernateException) {
				hibernateException.printStackTrace();
			}
		}

	}

	@Override
	public void readFlight(int flightId) {
		System.out.println("Reading Flight");
		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = singleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			FlightDTO flightDTO = session.get(FlightDTO.class, flightId);
			System.out.println(flightDTO);
		} catch (HibernateException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");

				} else {
					System.out.println("session is not closed");

				}
				singleFactory.closeSessionFactory();

			} catch (HibernateException hibernateException) {
				hibernateException.printStackTrace();
			}

		}

	}

	@Override
	public void updateFlight(int flightId) {
		System.out.println("update invoked");
		Session session = null;
		try {
			SessionFactory sessionFactory = singleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			FlightDTO flightDTO = session.get(FlightDTO.class, flightId);
			flightDTO.setFlightName("GO AIR");
			Transaction transaction = session.beginTransaction();
			session.update(flightDTO);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				} else {
					System.out.println("sesssion is not closed");
				}
			} catch (HibernateException hibernateException) {
				hibernateException.printStackTrace();
			}
		}

	}

	@Override
	public void deleteFlight(int flightId) {
		System.out.println("delete flight");
		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = singleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			FlightDTO flightDTO = session.get(FlightDTO.class, flightId);
			transaction = session.beginTransaction();
			session.delete(flightDTO);
			transaction.commit();
		} catch (HibernateException hibernateException) {
			hibernateException.printStackTrace();
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				} else {
					System.out.println("session is not closed");
				}
			} catch (HibernateException e) {
				e.printStackTrace();
				;
			}
		}

	}

}