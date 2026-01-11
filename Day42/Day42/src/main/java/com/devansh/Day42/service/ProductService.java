package com.devansh.Day42.service;

import com.devansh.Day42.entity.Product;
import com.devansh.Day42.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public Page<Product> getProducts(Pageable pageable) {
        return repo.findAll(pageable);
    }
}
