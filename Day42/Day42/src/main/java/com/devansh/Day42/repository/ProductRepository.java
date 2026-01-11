package com.devansh.Day42.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devansh.Day42.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
