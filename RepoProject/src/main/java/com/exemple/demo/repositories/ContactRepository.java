package com.exemple.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.demo.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
	
	public List<Contact> findAllContacts(); 
}
