package com.devansh.Day49.repository;

import com.devansh.Day49.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
