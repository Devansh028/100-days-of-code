package com.devansh.Day53.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    public String process(String input) {
        logger.debug("Processing input: {}", input);

        if (input == null || input.isBlank()) {
            logger.warn("Received empty input");
            return "Invalid input";
        }

        logger.info("Input processed successfully");
        return "Processed: " + input;
    }
}
