package com.devansh.Day53.controller;

import com.devansh.Day53.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    private final DemoService service;

    public DemoController(DemoService service) {
        this.service = service;
    }

    @GetMapping
    public String demo(@RequestParam(required = false) String input) {
        logger.info("Received request with input={}", input);
        return service.process(input);
    }
}
