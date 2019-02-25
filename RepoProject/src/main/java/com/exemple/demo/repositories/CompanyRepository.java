package com.exemple.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.demo.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
