package com.example.demorest.products;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
public class ProductControllerWebMvcTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getProductById() throws Exception {
        MvcResult response = mvc.perform(get("/products/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
        byte[] responseByte = response.getResponse().getContentAsByteArray();
        ObjectMapper objectMapper = new ObjectMapper();
        ProductResponse result = objectMapper.readValue(responseByte, ProductResponse.class);
        // Assert
        assertEquals(1, result.getId());
        assertEquals("Product 1", result.getName());
    }
}