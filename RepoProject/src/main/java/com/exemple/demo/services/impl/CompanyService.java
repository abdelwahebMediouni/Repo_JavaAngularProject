package com.exemple.demo.services.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.demo.entities.Company;
import com.exemple.demo.repositories.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	CompanyRepository companyRepository;
	
	public void createCompany(Company p) {
		companyRepository.save(p);		
	}

	public void updateCompany(Company p)  {
		companyRepository.saveAndFlush(p);		
	}

	public Optional<Company> getCompany(Long id) {
	return 	companyRepository.findById(id);
	}

	public Collection<Company> listeCompanys() {
		return companyRepository.findAll();
	}

}

