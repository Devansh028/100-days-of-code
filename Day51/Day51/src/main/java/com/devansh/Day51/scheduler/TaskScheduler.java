package com.devansh.Day51.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskScheduler {

    @Scheduled(fixedRate = 5000)
    public void runEveryFiveSeconds() {
        System.out.println("Fixed Rate Task running at " + LocalDateTime.now());
    }

    @Scheduled(fixedDelay = 5000)
    public void runWithDelay() {
        System.out.println("Fixed Delay Task running at " + LocalDateTime.now());
    }
}
