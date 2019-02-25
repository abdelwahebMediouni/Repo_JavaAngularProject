package com.exemple.demo.restServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.demo.entities.Contact;
import com.exemple.demo.repositories.ContactRepository;

@CrossOrigin("*")
@RestController
public class ContactRestService {

	@Autowired
	ContactRepository contactRepository;

	@RequestMapping(value="/Contacts", method= RequestMethod.GET)
	public List<Contact> listContacts() {

		return (contactRepository.findAll());
	}
	@RequestMapping(value="/Contacts/{id}", method= RequestMethod.GET)
	public Optional<Contact> getContact(@PathVariable ("id") Long id) {

		
		return contactRepository.findById(id);
	}
	@RequestMapping(value="/Contacts", method= RequestMethod.POST)
	public Contact saveContact(@RequestBody Contact contact) {

		
		return contactRepository.save(contact);
	}
	@RequestMapping(value="/Contacts/{id}", method= RequestMethod.PUT)
	public void updateContact(@RequestBody Contact contact,@PathVariable Long id) {

		 contact.setId(id);
		 contactRepository.saveAndFlush(contact);
	}
	@RequestMapping(value="/Contacts/{id}", method= RequestMethod.DELETE)
	public boolean deletePerson(@PathVariable Long id) {

		
		contactRepository.deleteById(id);
		return true;
	}
	
}