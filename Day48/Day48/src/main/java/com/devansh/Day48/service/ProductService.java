package com.devansh.Day48.service;

import com.devansh.Day48.entity.*;
import com.devansh.Day48.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    @Transactional
    public Product updateWithLock(Long id, double newPrice) {
        Product product = repo.findByIdForUpdate(id)
                .orElseThrow(() -> new RuntimeException("Not found"));

        product.setPrice(newPrice);
        return repo.save(product);
    }
}
