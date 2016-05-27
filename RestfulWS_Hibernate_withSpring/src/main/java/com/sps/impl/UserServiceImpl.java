package com.sps.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.sps.dao.DaoManager;
import com.sps.entity.Person;
import com.sps.intf.IUserServiceIntf;


public class UserServiceImpl implements IUserServiceIntf {
	
	private DaoManager daoManager;
	
	public DaoManager getDaoManager() {
		return daoManager;
	}

	public void setDaoManager(DaoManager daoManager) {
		this.daoManager = daoManager;
	}

	public Person saveUser(Person person) {
		return (Person) getDaoManager().saveOrUpdateEntity(person);
	}
	
	public Person getUser(Integer id) {
		Person person=null;
		Criteria criteria = daoManager.getSessionFactory().openSession().createCriteria(Person.class);
		criteria.add(Restrictions.eq("id",id));
		person=(Person) criteria.uniqueResult();
		return person;
	}
}