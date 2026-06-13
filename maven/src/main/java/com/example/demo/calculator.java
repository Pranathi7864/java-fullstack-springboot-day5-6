package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {
    @GetMapping("/calc/{n1}/{n2}/{str}")
    public int calc(@PathVariable int n1, @PathVariable int n2,@PathVariable String str)
    {
        int ans=0;
       if(str.equals("add"))
       {
           ans= n1+n2;
       }
       else if(str.equals("sub"))
       {
           ans= n1-n2;
       }
       else if(str.equals("mul"))
       {
           ans= n1*n2;
       }
       else if(str.equals("div"))
       {
           ans= n1/n2;
       }
       else if(str.equals("mod"))
       {
           ans= n1%n2;
       }
       return ans;
    }
}
