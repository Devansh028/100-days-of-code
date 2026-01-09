package com.devansh.day40.controller;

import com.devansh.day40.entity.Product;
import com.devansh.day40.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> getProducts() {
        return service.getAll();
    }
}
