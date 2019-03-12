package com.exemple.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)

public class Contact extends BaseEntity implements Serializable  {
	
	@Column
	private String name;
	
	private Long phoneNumber;

//	@OneToMany(cascade = CascadeType.ALL,
//			  fetch = FetchType.EAGER,
//			  mappedBy ="Address")
//	private List<Address> address;
	
	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Contact() {
	}
	
	public Contact(String name,Long phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}


	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getName()=" + getName() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
