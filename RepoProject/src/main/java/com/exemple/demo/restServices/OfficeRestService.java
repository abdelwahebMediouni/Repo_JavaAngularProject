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

import com.exemple.demo.entities.Office;
import com.exemple.demo.repositories.OfficeRepository;

@CrossOrigin("*")
@RestController
public class OfficeRestService {


	@Autowired
	OfficeRepository officeRepository;

	@RequestMapping(value="/Offices", method= RequestMethod.GET)
	public List<Office> listOffices() {

		return (officeRepository.findAll());
	}
	@RequestMapping(value="/Offices/{id}", method= RequestMethod.GET)
	public Optional<Office> getOffice(@PathVariable ("id") Long id) {	
		return officeRepository.findById(id);
	}
	@RequestMapping(value="/Offices", method= RequestMethod.POST)
	public Office saveOffice(@RequestBody Office Office) {

		
		return officeRepository.save(Office);
	}
	@RequestMapping(value="/Offices/{id}", method= RequestMethod.PUT)
	public void updateOffice(@RequestBody Office office,@PathVariable Long id) {

		office.setId(id);
		officeRepository.saveAndFlush(office);
	}
	@RequestMapping(value="/Offices/{id}", method= RequestMethod.DELETE)
	public boolean deletePerson(@PathVariable Long id) {
		officeRepository.deleteById(id);
		return true;
	}
	
}