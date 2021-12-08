package com.example.demorest.products;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository repository;

    @Test
    public void case_01() {
        // Arrange
        Product product1 = new Product("demo 01", 100);
        repository.save(product1);
        // Act
        Optional<Product> result = repository.findById(1);
        assertTrue(result.isPresent());
        assertEquals(1, result.get().getId());
        assertEquals("demo 01", result.get().getName());
    }


}