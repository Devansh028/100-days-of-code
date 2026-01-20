package com.devansh.Day50.controller;

import com.devansh.Day50.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class AsyncController {

    private final AsyncService service;

    public AsyncController(AsyncService service) {
        this.service = service;
    }

    @GetMapping("/async")
    public CompletableFuture<String> asyncEndpoint() {
        return service.processSlowTask();
    }
}
