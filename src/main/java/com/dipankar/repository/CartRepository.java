package com.dipankar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipankar.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Cart findByUserId(Long userId);
}
