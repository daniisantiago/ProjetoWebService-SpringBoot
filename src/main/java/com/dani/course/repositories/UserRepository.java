package com.dani.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dani.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
