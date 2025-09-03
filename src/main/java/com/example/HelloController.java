package com.example;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @QueryMapping
    public String hello() {
        return "Hello from Spring GraphQL!";
    }

    @QueryMapping
    public String greet(@Argument String name) {
        return "Hello, " + name + "!";
    }
}