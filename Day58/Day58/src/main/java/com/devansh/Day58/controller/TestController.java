package com.devansh.Day58.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/secure")
    public String secureApi() {
        return "JWT secured endpoint";
    }
}
