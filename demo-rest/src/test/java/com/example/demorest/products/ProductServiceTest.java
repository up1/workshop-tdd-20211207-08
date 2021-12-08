package com.example.demorest.products;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void getById() {
        // Act
        ProductResponse response = productService.getById(1);
        // Assert
        assertEquals(1, response.getId());
        assertEquals("Product 1", response.getName());
    }
}