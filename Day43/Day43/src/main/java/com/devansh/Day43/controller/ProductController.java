package com.devansh.Day43.controller;

import com.devansh.Day43.entity.Product;
import com.devansh.Day43.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/search")
    public List<Product> searchByName(
            @RequestParam String name) {
        return service.searchByName(name);
    }

    @GetMapping("/filter")
    public List<Product> filterByPrice(
            @RequestParam double min,
            @RequestParam double max) {
        return service.filterByPrice(min, max);
    }

    @GetMapping("/search-filter")
    public List<Product> searchAndFilter(
            @RequestParam String name,
            @RequestParam double min,
            @RequestParam double max) {
        return service.searchAndFilter(name, min, max);
    }
}
