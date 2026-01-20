package com.devansh.Day50.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

    @Async("asyncExecutor")
    public CompletableFuture<String> processSlowTask() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {
        }

        return CompletableFuture.completedFuture("Async task completed");
    }
}
