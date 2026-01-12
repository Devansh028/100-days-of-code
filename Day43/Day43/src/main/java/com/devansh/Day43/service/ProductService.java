package com.devansh.Day43.service;

import com.devansh.Day43.entity.Product;
import com.devansh.Day43.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> searchByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

    public List<Product> filterByPrice(double min, double max) {
        return repository.findByPriceBetween(min, max);
    }

    public List<Product> searchAndFilter(String name, double min, double max) {
        return repository
                .findByNameContainingIgnoreCaseAndPriceBetween(name, min, max);
    }
}
