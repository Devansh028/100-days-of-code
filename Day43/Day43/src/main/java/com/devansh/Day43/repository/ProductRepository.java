package com.devansh.Day43.repository;

import com.devansh.Day43.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByNameContainingIgnoreCase(String name);

    List<Product> findByPriceBetween(double min, double max);

    List<Product> findByNameContainingIgnoreCaseAndPriceBetween(
            String name, double min, double max);
}
