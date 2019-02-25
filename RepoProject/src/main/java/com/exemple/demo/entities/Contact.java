package com.exemple.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Contact extends BaseEntity implements Serializable  {
	
	@Column
	private String name;
//
//	@OneToMany(cascade = CascadeType.ALL,
//			  fetch = FetchType.EAGER,
//			  mappedBy ="Address")
//	private List<Address> address;
	
	public Contact() {
	}
	
	public Contact(String name) {
		super();
		this.name = name;
		
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
