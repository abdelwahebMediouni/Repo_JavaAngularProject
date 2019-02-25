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
import com.exemple.demo.entities.Person;
import com.exemple.demo.repositories.PersonRepository;

@CrossOrigin("*")
@RestController
public class PersonRestService {

	@Autowired
	PersonRepository personRepository;

	@RequestMapping(value="/Person", method= RequestMethod.GET)
	public List<Person> listPersons() {

		return (personRepository.findAll());
	}
	@RequestMapping(value="/Person/{id}", method= RequestMethod.GET)
	public Optional<Person> getPerson(@PathVariable ("id") Long id) {

		
		return personRepository.findById(id);
	}
	@RequestMapping(value="/Person", method= RequestMethod.POST)
	public Person savePerson(@RequestBody Person person) {

		
		return personRepository.save(person);
	}
	@RequestMapping(value="/Person/{id}", method= RequestMethod.PUT)
	public void updatePerson(@RequestBody Person person,@PathVariable Long id) {

		person.setId(id);
		personRepository.saveAndFlush(person);
	}
	@RequestMapping(value="/Person/{id}", method= RequestMethod.DELETE)
	public boolean deletePerson(@PathVariable Long id) {

		
		personRepository.deleteById(id);
		return true;
	}
	
}
