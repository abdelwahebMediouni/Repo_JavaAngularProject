package com.exemple.demo.repositories;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exemple.demo.entities.Office;
import com.exemple.demo.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
	
@Query("select E from Person E WHERE E.id = :id")
public Person chercher(long id);
	
}


