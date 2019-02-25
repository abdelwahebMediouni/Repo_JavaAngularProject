package com.exemple.demo.services.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.demo.entities.Office;
import com.exemple.demo.repositories.OfficeRepository;

@Service
public class OfficeService {
	@Autowired
	OfficeRepository officeRepository;
	
		public void createOffice(Office p) {
			officeRepository.save(p);		
		}

		public void updateOffice(Office p)  {
			officeRepository.saveAndFlush(p);		
		}

		public Optional<Office> getOffice(Long id) {
		return 	officeRepository.findById(id);
		}

		public Collection<Office> listeOffices() {
			return officeRepository.findAll();
		}

	}

