package com.devansh.Day54.service;

import com.devansh.Day54.exception.*;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String process(String input) {
        if (input == null || input.isBlank()) {
            throw new CustomException("Input must not be empty");
        }
        return "Processed: " + input;
    }
}
