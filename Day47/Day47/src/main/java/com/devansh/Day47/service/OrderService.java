package com.devansh.Day47.service;

import com.devansh.Day47.entity.*;
import com.devansh.Day47.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    private final OrderRepository orderRepo;

    public OrderService(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Transactional
    public Order createOrder(Order order) {
        Order saved = orderRepo.save(order);

        // Simulate failure
        if (saved.getAmount() > 50000) {
            throw new RuntimeException("Payment failed");
        }

        return saved;
    }
}
