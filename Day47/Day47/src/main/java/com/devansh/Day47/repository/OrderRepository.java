package com.devansh.Day47.repository;

import com.devansh.Day47.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
