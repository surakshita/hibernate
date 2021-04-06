package com.xworkz.tractor.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.tractor.dto.TractorDTO;

public class TractorDAOImpl implements TractorDAO{

	
	private SessionFactory sessionFactory;
	
	
	
	public TractorDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}



	@Override
	public void saveTractor(TractorDTO dto) {
		System.out.println("invoked save tractor");
		Session session=null;
		Transaction transaction=null;
		
		try {
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(dto);
			transaction.commit();
			System.out.println("tractor dto saved");
		} catch (Exception e) {
			transaction.rollback();
		}finally {
			if(Objects.nonNull(session)) {
				session.close();
				System.out.println("session closed");
			}else {
				System.out.println("session not closed");
			}
		}
		
		
		
		
	}
	
	

}
