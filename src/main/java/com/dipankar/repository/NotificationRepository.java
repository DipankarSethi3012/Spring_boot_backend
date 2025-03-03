package com.dipankar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipankar.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
