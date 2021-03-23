package com.xworkz.register.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.register.dto.UserInfoDTO;
import com.xworkz.singleSessionFactory.SingleFactory;

public class RegisterDAOImpl implements RegisterDAO {

	@Override
	public void saveUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("invoked save user info");
		Session session=null;
		Transaction transaction=null;
		try {
			SessionFactory sessionFactory=SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
	
			session.save(userInfoDTO);
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
			} catch (HibernateException hibernateException) {
				hibernateException.printStackTrace();
			}
			SingleFactory.closeSessionFactory();
		}
		

	}

}
