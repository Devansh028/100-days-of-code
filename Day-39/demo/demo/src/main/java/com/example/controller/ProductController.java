package com.example.controller;

import com.devansh.jpa.entity.Product;
import com.devansh.jpa.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.create(product);
    }
}
