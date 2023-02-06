package com.eueduco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eueduco.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
