package com.devansh.Day56.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SecureController {

    @GetMapping("/public")
    public String publicApi() {
        return "This is a public endpoint";
    }

    @GetMapping("/secure")
    public String secureApi() {
        return "This is a secured endpoint";
    }
}
