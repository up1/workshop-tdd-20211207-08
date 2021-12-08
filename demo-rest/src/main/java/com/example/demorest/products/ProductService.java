package com.example.demorest.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private OtherService otherService;

    public ProductResponse getById(int id) {
        otherService.doSth();
        return new ProductResponse( id, "Product 1", 200.50 );
    }
}
