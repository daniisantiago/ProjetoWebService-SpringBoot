package com.dani.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dani.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
