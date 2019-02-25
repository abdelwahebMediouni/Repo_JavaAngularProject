package com.exemple.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.demo.entities.Office;

public interface OfficeRepository extends JpaRepository<Office, Long> {

}
