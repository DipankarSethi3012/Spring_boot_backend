package com.dipankar.repository;

import com.dipankar.model.Cart;
import com.dipankar.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dipankar.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
