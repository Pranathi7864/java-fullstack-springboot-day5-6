package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class stringbuilder {
    @GetMapping("/calc/{a}/{b}")
    @ResponseBody
    public String calc(@PathVariable int a, @PathVariable int b)
    {
        StringBuilder sb=new StringBuilder();
        sb.append("Sum: ").append(a+b).append("\n");
        sb.append("Difference: ").append(a-b).append("\n");
        sb.append("Product: ").append(a*b).append("\n");
        if(b!=0)
        {
            sb.append("Quotient: ").append(a/b).append("\n");
            sb.append("Remainder: ").append(a%b).append("\n");
        }
        else {
            sb.append("Cannot be divided by zero").append("\n");
            sb.append("Remainder is not possible when divided by zero").append("\n");
        }
        return "<h1><pre>"+sb.toString()+"</pre></h1>";

    }

}
