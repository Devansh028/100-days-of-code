package com.devansh.Day46.repository;

import com.devansh.Day46.entity.*;
import com.devansh.Day46.projection.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p.id as id, p.name as name, p.price as price from Product p")
    List<ProductView> findAllProjected();

    @Query("select p from Product p where p.price >= :min")
    List<Product> findByMinPrice(@Param("min") double min);

    List<Product> findByMaxPriceNative(double max);
}
