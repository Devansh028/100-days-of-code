package com.devansh.Day47.specification;

import com.devansh.Day47.entity.*;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecification {

    public static Specification<Product> hasName(String name) {
        return (root, query, cb) -> name == null ? null
                : cb.like(cb.lower(root.get("name")),
                        "%" + name.toLowerCase() + "%");
    }

    public static Specification<Product> hasCategory(String category) {
        return (root, query, cb) -> category == null ? null
                : cb.equal(cb.lower(root.get("category")),
                        category.toLowerCase());
    }

    public static Specification<Product> priceBetween(
            Double min, Double max) {

        return (root, query, cb) -> {
            if (min == null && max == null)
                return null;
            if (min != null && max != null)
                return cb.between(root.get("price"), min, max);
            if (min != null)
                return cb.greaterThanOrEqualTo(root.get("price"), min);
            return cb.lessThanOrEqualTo(root.get("price"), max);
        };
    }
}
