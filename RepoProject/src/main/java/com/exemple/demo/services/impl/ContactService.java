package com.exemple.demo.services.impl;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.demo.entities.Contact;
import com.exemple.demo.repositories.ContactRepository;

@Service
public class ContactService {
	@Autowired
	ContactRepository contactRepository;
	
	
	
	public void createContact(Contact p) {
		contactRepository.save(p);		
	}

	public void updateContact(Contact p)  {
		contactRepository.saveAndFlush(p);		
	}

	public Optional<Contact> getContact(Long id) {
	return 	contactRepository.findById(id);
	}

	public Collection<Contact> listeContacts() {
		return contactRepository.findAll();
	}

	public List<Contact> findAllContacts() {
		
			  return contactRepository.findAllContacts() ;
			
	}
}
