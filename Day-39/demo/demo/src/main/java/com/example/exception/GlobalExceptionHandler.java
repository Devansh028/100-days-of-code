package com.example.exception;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handle(ProductNotFoundException ex) {
        return ResponseEntity.status(404).body(ex.getMessage());
    }
}
