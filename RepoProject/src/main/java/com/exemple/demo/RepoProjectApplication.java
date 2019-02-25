package com.exemple.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.exemple.demo.entities.Office;
import com.exemple.demo.repositories.PersonRepository;
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class RepoProjectApplication implements CommandLineRunner {

	
//	@Autowired
//	PersonDaoImpl personDaoImpl;
	
	@Autowired
	PersonRepository personRepository; 

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
		List<Office> offices = personRepository.chercher();
		offices.stream().forEach(System.out::println);

	}
}





