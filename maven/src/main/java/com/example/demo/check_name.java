package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class check_name {
    @GetMapping("/cn/name/{name}")
    public String cn(@PathVariable String name)
    {
        String s=name.toLowerCase(); //good catch!
        if(s.equals("pranathi"))
        {
            return "This is my name";
        }
        else{
            return "This is not my name";

        }
    }
}
