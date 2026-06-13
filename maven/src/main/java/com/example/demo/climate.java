package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class climate {
    @GetMapping("/climate/{temp}")
    public String clim(@PathVariable int temp)
    {
        if(temp<0)
        {
            return "Shivering";
        }
        else if(temp>=0 && temp<=15)
        {
            return "Chill!";
        }
        else if(temp>15 && temp<=24)
        {
            return "Happy";
        }
        else if(temp>24 && temp<=30)
        {
            return "Towards Hot";
        }
        else if(temp>30 && temp<=32)
        {
            return "Hotter";
        }
        else
        {
            return "OMG";
        }

    }
}
