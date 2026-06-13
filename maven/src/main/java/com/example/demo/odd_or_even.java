package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class odd_or_even {
    @GetMapping("/oe/{n1}/{n2}")
    public String oe(@PathVariable int n1,@PathVariable int n2)
    {
        int sum=n1+n2;
        if(sum%2==0)
        {
            return "Sum: Even";
        }
        else{
            return "Sum: Odd";
        }

    }
}
