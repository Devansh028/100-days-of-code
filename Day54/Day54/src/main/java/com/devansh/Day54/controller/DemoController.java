package com.devansh.Day54.controller;

import com.devansh.Day54.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private final DemoService service;

    public DemoController(DemoService service) {
        this.service = service;
    }

    @GetMapping
    public String demo(@RequestParam(required = false) String input) {
        return service.process(input);
    }
}
