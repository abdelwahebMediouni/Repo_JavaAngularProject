package com.exemple.demo.restServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.demo.entities.Company;
import com.exemple.demo.repositories.CompanyRepository;

@CrossOrigin("*")
@RestController
public class CompanyRestService {

	@Autowired
	CompanyRepository companyRepository;

	@RequestMapping(value="/Company", method= RequestMethod.GET)
	public List<Company> listCompanys() {

		return (companyRepository.findAll());
	}
	@RequestMapping(value="/Company/{id}", method= RequestMethod.GET)
	public Optional<Company> getCompany(@PathVariable ("id") Long id) {	
		return companyRepository.findById(id);
	}
	@RequestMapping(value="/Company", method= RequestMethod.POST)
	public Company saveCompany(@RequestBody Company Company) {

		
		return companyRepository.save(Company);
	}
	@RequestMapping(value="/Company/{id}", method= RequestMethod.PUT)
	public void updateCompany(@RequestBody Company company,@PathVariable Long id) {

		company.setId(id);
		companyRepository.saveAndFlush(company);
	}
	@RequestMapping(value="/Company/{id}", method= RequestMethod.DELETE)
	public boolean deletePerson(@PathVariable Long id) {
		companyRepository.deleteById(id);
		return true;
	}
	
}