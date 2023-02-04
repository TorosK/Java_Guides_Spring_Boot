package com.example.java_guides_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // GET HTTP method
    // http://localhost:8080/hello_world
    @GetMapping("/hello_world")
    public String helloWorld() {
        return "Hello World!";
    }
}
