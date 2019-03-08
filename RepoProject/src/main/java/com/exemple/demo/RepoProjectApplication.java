package com.exemple.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.exemple.demo.entities.Country;
import com.exemple.demo.repositories.CountryRepository;
import com.exemple.demo.repositories.PersonRepository;
import com.exemple.demo.services.impl.ContactService;
import com.exemple.demo.services.impl.PersonService;
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class RepoProjectApplication implements CommandLineRunner {

	
//	@Autowired
//	PersonDaoImpl personDaoImpl;
	
	@Autowired
	PersonRepository personRepository; 
	@Autowired
	CountryRepository countryRepository; 
	
	@Autowired
	PersonService personService;
	@Autowired
	ContactService contactService;

	public static void main(String[] args) {
		SpringApplication.run(RepoProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
//		personService.createPersonne(new Person("mohamed1", new Address("xx","xxx","xxxx","xxxxx")));
		
//		addressRepository.save(new Address("xx","xxx","xxxx","xxxxx"));
		
//		personRepository.save(new Person("mohamed", new Address("xx","xxx","xxxx","xxxxx")));
//		personRepository.save(new Person("Ali", new Address("xx","xxx","xxxx","xxxxx")));
//		personRepository.save(new Person("anis", new Address("xx","xxx","xxxx","xxxxx")));
//		contactRepository.save(new Contact("72 avenue maurice thorez Ivry sur seine"));
//		contactRepository.save(new Contact("221bis Boulevard Jean Jaurès Boulogne"));
//		contactRepository.save(new Contact("1 Rue de Chateaudun Ivry sur seine"));

//		contactRepository.save(new Contact(" 45 rue jean lenon paris",null));
//		contactRepository.save(new Contact(" 09 rue thevez alfonce ",null));
//		addressRepository.save(new Address("eee","dddd","dddd","dddd",null));
		List<Country> offices = countryRepository.findAll();
		
	offices.stream().forEach(System.out::println);
//		
		//personService.createPersonne(new Person("Ali", new Address("xxm","xxx","xxxx","xxxxx")));
		//personService.ChercherPerson(130);
//		if(personService.ChercherPerson(130) != null)
//		{
//			System.out.println(personService.ChercherPerson(130));
//		}
//		
//		else
//			System.out.println("nothing to print");
//		
//		contactService.findAllContacts().stream().forEach(System.out::println);
		//contactService.createContact(new Contact(" 49 rue jean lenon paris"));
		//System.out.println(contactService.findAllContacts());

	}
}





