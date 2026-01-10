package com.example.Day41.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Product {

    private Long id;

    @NotBlank(message = "Product name must not be empty")
    private String name;

    @Min(value = 1, message = "Price must be greater than 0")
    private double price;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
