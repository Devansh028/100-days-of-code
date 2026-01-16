package com.devansh.Day46.controller;

import com.devansh.Day46.entity.Product;
import com.devansh.Day46.projection.*;
import com.devansh.Day46.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/view")
    public List<ProductView> getProjected() {
        return service.getAllProjected();
    }

    @GetMapping("/min-price")
    public List<Product> minPrice(@RequestParam double min) {
        return service.getByMinPrice(min);
    }

    @GetMapping("/max-price")
    public List<Product> maxPrice(@RequestParam double max) {
        return service.getByMaxPrice(max);
    }
}
