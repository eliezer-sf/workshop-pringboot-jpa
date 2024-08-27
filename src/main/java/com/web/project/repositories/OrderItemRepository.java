package com.web.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
