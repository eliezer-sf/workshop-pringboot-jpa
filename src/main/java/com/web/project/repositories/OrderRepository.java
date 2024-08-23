package com.web.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
