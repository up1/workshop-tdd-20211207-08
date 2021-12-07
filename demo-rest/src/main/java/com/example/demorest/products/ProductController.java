package com.example.demorest.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products/{id}")
    public ProductResponse getProductById(@PathVariable int id) {
        return new ProductResponse();
    }

}
