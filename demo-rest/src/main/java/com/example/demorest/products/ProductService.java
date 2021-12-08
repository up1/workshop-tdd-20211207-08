package com.example.demorest.products;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public ProductResponse getById(int id) {
        return new ProductResponse( id, "Product 1", 200.50 );
    }
}
