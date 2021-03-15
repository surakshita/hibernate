package com.xworkz.planet.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.planet.dto.PlanetDTO;
import com.xworkz.singleSessionFactory.SingleFactory;

public class PlanetDAOImpl implements PlanetDAO {

	@Override
	public void savePlanet(PlanetDTO planetDTO) {
		System.out.println("invoked save planet");
		Session session=null;
		Transaction transaction=null;
		try {
			SessionFactory sessionFactory=SingleFactory.getSessionFactory();
			session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(planetDTO);
			session.getTransaction().commit();
			System.out.println("planet dto is saved");
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			System.out.println("error rollback");
		}finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				}else {
					System.out.println("session is not closed");
				}
				SingleFactory.closeSessionFactory();
			} catch (HibernateException e2) {
				e2.printStackTrace();
			}
		}
		

	}

}
