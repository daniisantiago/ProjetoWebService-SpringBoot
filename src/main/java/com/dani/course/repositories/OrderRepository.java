package com.dani.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dani.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
