package com.devansh.backend.service;

import com.devansh.backend.dto.ProductDTO;
import com.devansh.backend.exception.ProductNotFoundException;
import com.devansh.backend.model.Product;
import com.devansh.backend.repository.ProductRepository;
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

    public Product getById(int id) {
        Product product = repo.findById(id);
        if (product == null) {
            throw new ProductNotFoundException("Product not found with id " + id);
        }
        return product;
    }

    public Product create(ProductDTO dto) {
        return repo.save(new Product(0, dto.getName(), dto.getPrice()));
    }

    public Product update(int id, ProductDTO dto) {
        Product existing = getById(id);
        existing.setName(dto.getName());
        existing.setPrice(dto.getPrice());
        return repo.update(id, existing);
    }

    public void delete(int id) {
        getById(id);
        repo.delete(id);
    }
}
