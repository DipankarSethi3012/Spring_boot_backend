package com.dipankar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipankar.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
