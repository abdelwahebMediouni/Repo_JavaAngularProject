package com.exemple.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Office extends BaseEntity {
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="companyId")
	private Company company;
	
	public Company getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "Office [company=" + company + ", address=" + address + ", getCompany()=" + getCompany().getId()
				+ ", getAddress()=" + getAddress().getCity() + ", getId()=" + getId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setCompany(Company company) {
		this.company = company;
	}

//	public Office(Company company, Address address) {
//		super();
//		this.company = company;
//		this.address = address;
//	}

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
