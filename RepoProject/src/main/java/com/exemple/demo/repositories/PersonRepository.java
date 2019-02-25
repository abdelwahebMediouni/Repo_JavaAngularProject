package com.exemple.demo.repositories;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exemple.demo.entities.Office;
import com.exemple.demo.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
	
@Query("select c from Office c")
public List<Office> chercher();
	
}


