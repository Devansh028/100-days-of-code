package com.devansh.Day47.service;

import com.devansh.Day47.projection.*;
import com.devansh.Day47.entity.*;
import com.devansh.Day47.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<ProductView> getAllProjected() {
        return repo.findAllProjected();
    }

    public List<Product> getByMinPrice(double min) {
        return repo.findByMinPrice(min);
    }

    public List<Product> getByMaxPrice(double max) {
        return repo.findByMaxPriceNative(max);
    }
}
