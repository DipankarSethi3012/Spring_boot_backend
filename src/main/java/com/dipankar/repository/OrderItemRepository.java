package com.dipankar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipankar.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
