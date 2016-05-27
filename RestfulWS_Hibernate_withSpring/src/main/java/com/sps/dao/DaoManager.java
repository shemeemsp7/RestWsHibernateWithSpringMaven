package com.sps.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DaoManager {
 SessionFactory sessionFactory;

public SessionFactory getSessionFactory() {
	return sessionFactory;
}

public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}
 
public Object saveOrUpdateEntity(Object entity){
	
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	try {
		session.saveOrUpdate(entity);
		tx.commit();
	} catch (Exception e) {
		tx.rollback();
	} finally {
		session.close();
	}
	return entity;
	
	
}

}
