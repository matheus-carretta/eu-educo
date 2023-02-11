package com.eueduco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eueduco.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
