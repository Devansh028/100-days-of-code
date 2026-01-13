package com.devansh.Day44.service;

import com.devansh.Day44.entity.Product;
import com.devansh.Day44.repository.ProductRepository;
import com.devansh.Day44.specification.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> searchProducts(
            String name,
            String category,
            Double minPrice,
            Double maxPrice) {
        Specification<Product> spec = Specification
                .where(ProductSpecification.hasName(name))
                .and(ProductSpecification.hasCategory(category))
                .and(ProductSpecification.priceBetween(minPrice, maxPrice));

        return repository.findAll(spec);
    }
}
