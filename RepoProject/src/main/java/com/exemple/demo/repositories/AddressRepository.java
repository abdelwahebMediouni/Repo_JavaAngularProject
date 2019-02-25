package com.exemple.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.demo.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
