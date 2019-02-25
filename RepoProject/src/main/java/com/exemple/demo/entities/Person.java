package com.exemple.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity

public class Person extends Contact {
	
	@OneToOne(cascade= CascadeType.ALL)
	private Address address;

	public Person(String name, Address address) {
		super(name);
		this.address = address;
	}
	public Person() {
		
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	} 
	

}