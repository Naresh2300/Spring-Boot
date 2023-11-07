package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // for Accessing this method  http:localhost:8080/hello
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello-I am Making Spring Boot Project";
    }
}
