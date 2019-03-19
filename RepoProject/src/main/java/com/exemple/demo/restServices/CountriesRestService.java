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

import com.exemple.demo.entities.Country;
import com.exemple.demo.entities.Office;
import com.exemple.demo.repositories.CountryRepository;


@CrossOrigin("*")
@RestController
public class CountriesRestService {

	@Autowired
	CountryRepository countryRepository;

	@RequestMapping(value="/Countries", method= RequestMethod.GET)
	public List<Country> listCountries() {

		return (countryRepository.findAll());
	}
	@RequestMapping(value="/Countries/{id}", method= RequestMethod.GET)
	public Optional<Country> getCountry(@PathVariable ("id") Long id) {	
		return countryRepository.findById(id);
	}
	@RequestMapping(value="/Countries", method= RequestMethod.POST)
	public Country saveCountry(@RequestBody Country country) {

		
		return countryRepository.save(country);
	}
	@RequestMapping(value="/Countries/{id}", method= RequestMethod.PUT)
	public void updateCountry(@RequestBody Country country,@PathVariable Long id) {

		country.setId(id);
		countryRepository.saveAndFlush(country);
	}
	@RequestMapping(value="/Countries/{id}", method= RequestMethod.DELETE)
	public boolean deleteCountry(@PathVariable Long id) {
		countryRepository.deleteById(id);
		return true;
	}

}



