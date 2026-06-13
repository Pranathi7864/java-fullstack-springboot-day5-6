package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class htmlfile {
    @GetMapping("/myhtml")

    public String myhtml()
    {
        return "<h1 style='text-align:center; color: blue; border: 20px solid pink;'>Helloooo</h1> <p>Hiiiiiiiii</p>     <img src='photos/stem project image.png' height=400><br> <img src='photos/Screenshot 2025-10-12 215925.png' height=400 > ";


    }
}
