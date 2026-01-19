package com.devansh.Day49.service;

import com.devansh.Day49.entity.*;
import com.devansh.Day49.repository.*;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    @Cacheable(value = "products", key = "#id")
    public Product getById(Long id) {
        slowCall();
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @CachePut(value = "products", key = "#result.id")
    public Product save(Product product) {
        return repo.save(product);
    }

    @CacheEvict(value = "products", key = "#id")
    public void delete(Long id) {
        repo.deleteById(id);
    }

    private void slowCall() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }
    }
}
