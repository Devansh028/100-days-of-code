package com.devansh.Day62.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PreAuthorize("hasAuthority(T(com.devansh.Day60.security.Permission).READ_USER)")
    @GetMapping("/profile")
    public String profile() {
        return "User profile accessed";
    }

    @PreAuthorize("hasAuthority(T(com.devansh.Day60.security.Permission).WRITE_USER)")
    @PostMapping("/update")
    public String update() {
        return "User updated";
    }
}
