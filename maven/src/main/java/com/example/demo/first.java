package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class first {
    @GetMapping("/hello")
    public String sayHello()
    {
        return "hello";


    }
    @GetMapping("/hi/pran")
    public String sayhi() //display name with static end points
    {
        return "pran";
    }

    @GetMapping("hello/{name}") //one end point with dynamic name changing given in the path
    public String sayname(@PathVariable String name)
    {
        return "Hello "+name;

    }

    @GetMapping({"/hello", "/hello/{name}"}) //two or more endpoints
    public String sayHello(@PathVariable(required = false) String name) {
        if (name == null) {
            return "hello";
        }
        return "hello " + name;
    }

@GetMapping("/intro/{name}/{city}/{course}")
    public String intro(@PathVariable String name, @PathVariable String city, @PathVariable String course)
{
    return "Hello,I am "+name+" and I come from "+city+". I have choosen "+course;
}

}
