package com.example.mytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/cat")
    public String foo(){
        return "Hii Kitty";
    }
}
