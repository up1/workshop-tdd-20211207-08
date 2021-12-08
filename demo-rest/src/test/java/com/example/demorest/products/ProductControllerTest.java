package com.example.demorest.products;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ProductControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getProductById() {
        ProductResponse result = restTemplate.getForObject("/products/1", ProductResponse.class);
        assertEquals(1, result.getId());
        assertEquals("Product 1", result.getName());
    }

    @Test
    public void getProductById2() {
        ProductResponse result = restTemplate.getForObject("/products/1", ProductResponse.class);
        assertEquals(1, result.getId());
        assertEquals("Product 1", result.getName());
    }
}