package com.exemple.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
public class Company extends Contact{

	
	public Company(String name,Long phoneNumber, List<Office> offices) {
		super(name,phoneNumber);
		this.offices = offices;
	}
	public Company() {
	}

	@OneToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="company")
	private List<Office> offices;

	public List<Office> getOffices() {
		return offices;
	}

	public void setOffices(List<Office> offices) {
		this.offices = offices;
	}



	
	
	

}
