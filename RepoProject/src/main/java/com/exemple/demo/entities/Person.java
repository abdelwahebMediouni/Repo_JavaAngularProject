package com.exemple.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person extends Contact {
	
	@OneToOne(cascade= CascadeType.ALL)
	private Address address;
	@OneToOne(cascade= CascadeType.ALL)
	private Country country;  

	public Person(String name,Long phoneNumber, Address address,Country country) {
		super(name,phoneNumber);
		this.address = address;
		this.country = country;
	}
	public Person() {
		
	}

	public Address getAddress() {
		return address;
	}

	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public void setAddress(Address address) {
		this.address = address;
	} 
	

}
