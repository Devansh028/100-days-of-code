package com.devansh.backend.repository;

import com.devansh.backend.model.Product;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductRepository {

    private final Map<Integer, Product> db = new HashMap<>();
    private int idCounter = 1;

    public List<Product> findAll() {
        return new ArrayList<>(db.values());
    }

    public Product findById(int id) {
        return db.get(id);
    }

    public Product save(Product product) {
        product = new Product(idCounter++, product.getName(), product.getPrice());
        db.put(product.getId(), product);
        return product;
    }

    public Product update(int id, Product product) {
        db.put(id, product);
        return product;
    }

    public void delete(int id) {
        db.remove(id);
    }
}
