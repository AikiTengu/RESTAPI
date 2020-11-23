package com.Bootstrap.controller;

import com.Bootstrap.entity.Dog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class DogServiceConsumer {

    @RequestMapping("/dogs")
    public Dog getDogs() {
        RestTemplate restTemplate = new RestTemplate();
        Dog dog = restTemplate.getForObject("http://localhost:8762/dogs/1", Dog.class);
        System.out.println(dog.getName());
        return null;

    }
}
