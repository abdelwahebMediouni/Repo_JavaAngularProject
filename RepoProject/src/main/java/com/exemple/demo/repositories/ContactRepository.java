package com.exemple.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.demo.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
