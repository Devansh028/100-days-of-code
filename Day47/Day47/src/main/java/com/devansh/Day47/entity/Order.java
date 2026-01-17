package com.devansh.Day47.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

}
