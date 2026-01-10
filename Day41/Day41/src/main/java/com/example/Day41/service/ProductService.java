package com.example.Day41.service;

import com.example.Day41.entity.Product;
import org.springframework.stereotype.*;
import com.example.Day41.repository.*;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product save(Product product) {
        return repo.save(product);
    }

    public List<Product> getAll() {
        return repo.findAll();
    }
}