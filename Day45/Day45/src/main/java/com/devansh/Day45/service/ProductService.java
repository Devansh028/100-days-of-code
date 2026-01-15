package com.devansh.Day45.service;

import com.devansh.Day45.entity.*;
import com.devansh.Day45.repository.*;
import com.devansh.Day45.specification.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Page<Product> searchProducts(
            String name,
            String category,
            Double minPrice,
            Double maxPrice,
            Pageable pageable) {
        Specification<Product> spec = Specification
                .where(ProductSpecification.hasName(name))
                .and(ProductSpecification.hasCategory(category))
                .and(ProductSpecification.priceBetween(minPrice, maxPrice));

        return repository.findAll(spec, pageable);
    }
}
