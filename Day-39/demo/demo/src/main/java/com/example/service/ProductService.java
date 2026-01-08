package com.example.service;

import com.devansh.jpa.entity.Product;
import com.devansh.jpa.exception.ProductNotFoundException;
import com.devansh.jpa.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    public Product create(Product product) {
        return repo.save(product);
    }

    public Product update(Long id, Product product) {
        Product existing = getById(id);
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.delete(getById(id));
    }
}
