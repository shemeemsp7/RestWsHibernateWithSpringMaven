package com.sps.impl;

import com.sps.dao.DaoManager;
import com.sps.entity.Person;
import com.sps.intf.IUserServiceIntf;


public class UserServiceImpl implements IUserServiceIntf {
	
	private DaoManager daoManager;
	
	public Person getUsers(){
		Person person = new Person();
		person.setName("Shemeem");
		return person;
	}

	public DaoManager getDaoManager() {
		return daoManager;
	}

	public void setDaoManager(DaoManager daoManager) {
		this.daoManager = daoManager;
	}

	public Person saveUser(Person person) {
		return getDaoManager().saveOrUpdatePerson(person);
	}
}
