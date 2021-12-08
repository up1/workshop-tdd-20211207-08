package com.example.demorest.products;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ProductControllerWithMockTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private OtherService otherService;

    @Test
    public void getProductById() {
        ProductResponse result = restTemplate.getForObject("/products/1", ProductResponse.class);
        assertEquals(1, result.getId());
        assertEquals("Product 1", result.getName());
    }


}