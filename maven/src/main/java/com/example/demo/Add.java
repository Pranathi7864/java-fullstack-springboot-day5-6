package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Add {
    @GetMapping("/add/{n1}/{n2}")
    public String add(@PathVariable int n1,@PathVariable int n2)
    {
        System.out.println("Addition:"+(n1+n2));

        return "Addition"+(n1+n2);
    }



}
