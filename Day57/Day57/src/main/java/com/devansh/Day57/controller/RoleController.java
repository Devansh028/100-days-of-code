package com.devansh.Day57.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoleController {

    @GetMapping("/public")
    public String publicApi() {
        return "Public access";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userApi() {
        return "User access";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminApi() {
        return "Admin access";
    }
}
