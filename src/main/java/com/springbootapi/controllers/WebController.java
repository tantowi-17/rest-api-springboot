package com.springbootapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WebController {

    @GetMapping
    public String welcome() {
        return "Welcome tanto";
    }

    @PostMapping
    public String other() {
        return "Welcome wibowo";
    }
    
}
