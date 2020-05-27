package com.dani.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dani.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
