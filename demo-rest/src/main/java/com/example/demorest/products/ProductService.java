package com.example.demorest.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private OtherService otherService;

    @Autowired
    private ProductRepository repository;

    public ProductResponse getById(int id) {
        otherService.doSth();
        // Get data from database
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        // Map entity to response
        return new ProductResponse( id, product.getName(), product.getPrice() );
    }
}
