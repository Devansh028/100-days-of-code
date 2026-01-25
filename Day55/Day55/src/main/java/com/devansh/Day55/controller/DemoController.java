package com.devansh.Day55.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Operation(summary = "Demo API", description = "Returns a greeting message")
    @GetMapping
    public String demo(
            @Parameter(description = "Name of the user", example = "Devansh") @RequestParam(defaultValue = "World") String name) {
        return "Hello " + name;
    }
}
