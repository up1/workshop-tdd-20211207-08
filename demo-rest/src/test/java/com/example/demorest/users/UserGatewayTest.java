package com.example.demorest.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserGatewayTest {

    @Autowired
    private UserGateway userGateway;

    @Test
    public void getById() {
        // Act
        User response = userGateway.getById(1);
        // Assert
        assertEquals(1, response.getId());
        assertEquals("Fake username", response.getUsername());
    }
}