package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class first {
    @GetMapping("/hello")
    public String sayHello()
    {
        return "Helloo";
    }

    @GetMapping("/name")
    public String sayName()
    {
        return "Riya";
    }

    @GetMapping("/address")
    public String sayAddress()
    {
        return "xxx, Tiruppur";
    }
    @GetMapping("/favcolor")
    public String sayColor()
    {
        return "Blue";
    }

}

