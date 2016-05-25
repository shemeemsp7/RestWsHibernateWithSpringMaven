package com.sps.dao;

import org.hibernate.SessionFactory;

import com.sps.entity.Person;

public class DaoManager {
 SessionFactory sessionFactory;

public SessionFactory getSessionFactory() {
	return sessionFactory;
}

public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}
 
public Person saveOrUpdatePerson(Person person){
	
	person=(Person) getSessionFactory().openSession().save(person);
	
	return person;
	
	
}

}
