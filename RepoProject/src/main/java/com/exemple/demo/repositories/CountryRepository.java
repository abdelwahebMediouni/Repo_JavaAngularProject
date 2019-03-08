package com.exemple.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.demo.entities.Contact;
import com.exemple.demo.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long>  {

		
}
