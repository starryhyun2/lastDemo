package com.example.lastdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @PostMapping ("/")
    public String goHome(){
        return "Home";
    }

    @GetMapping ("/")
    public String goHome2(){
        return "Home";
    }
}
