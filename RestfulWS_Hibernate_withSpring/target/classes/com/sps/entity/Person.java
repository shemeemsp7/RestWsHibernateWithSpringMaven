package com.sps.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Entity;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "person")
@Entity
@Table(name = "Person")
public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
