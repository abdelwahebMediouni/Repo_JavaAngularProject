package com.exemple.demo.services.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.demo.entities.Office;
import com.exemple.demo.entities.Person;
import com.exemple.demo.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	private static SessionFactory factory; 

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
	public List<Office> chercher()
	{
		return null;
		

	}
	
	
	
	public Person ChercherPerson(long id)
	{
		return personRepository.chercher(id);
		
		
		
//		
//		Session  session = factory.openSession();
//		Transaction tx = null;
//		Query query = null;
//		List results = null;
//		try {
//			
//			tx  = session.beginTransaction();
//		
//			String hql = "FROM Person E WHERE E.id ="+id;
//			 query = session.createQuery(hql);
//			 results = query.list();
//			  tx.commit();
//		
//	} catch (HibernateException e) {
//        if (tx!=null) tx.rollback();
//        e.printStackTrace(); 
//     } finally {
//        session.close(); 
//     }
//		return (Person) results;
//		
//		
		
	}
	
}
