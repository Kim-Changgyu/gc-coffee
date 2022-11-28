package com.example.gccoffee.service;

import com.example.gccoffee.model.Category;
import com.example.gccoffee.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(String productName, Category category, long price);

    Product createProduct(String productName, Category category, long price, String description);

    List<Product> getProductsByCategory(Category category);

    List<Product> getAllProducts();
}
