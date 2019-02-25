package com.exemple.demo.services.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.demo.entities.Person;
import com.exemple.demo.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	public void createPersonne(Person p) {
		personRepository.save(p);		
	}

	public void updatePersonne(Person p)  {
		personRepository.saveAndFlush(p);		
	}

	public Optional<Person> getPersonne(Long id) {
	return 	personRepository.findById(id);
	}

	public Collection<Person> listePersonnes() {
		return personRepository.findAll();
	}
	
}
