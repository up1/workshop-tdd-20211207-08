package com.example.demorest.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

    public User getById(int id) {
        String url ="https://jsonplaceholder.typicode.com/users/" + id;
        User response = restTemplate.getForObject(url, User.class);
        return response;
    }

}
