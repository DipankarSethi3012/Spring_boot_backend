package com.dipankar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipankar.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	public User findByEmail(String username);

}
