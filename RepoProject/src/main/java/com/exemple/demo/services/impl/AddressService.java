package com.exemple.demo.services.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.demo.entities.Address;
import com.exemple.demo.repositories.AddressRepository;

@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepository;
	
	public void createAddress(Address p) {
		addressRepository.save(p);		
	}

	public void updateAddress(Address p)  {
		addressRepository.saveAndFlush(p);		
	}

	public Optional<Address> getAddress(Long id) {
	return 	addressRepository.findById(id);
	}

	public Collection<Address> listeAddresss() {
		return addressRepository.findAll();
	}

}

