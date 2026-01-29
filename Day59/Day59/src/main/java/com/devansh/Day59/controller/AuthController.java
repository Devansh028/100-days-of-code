package com.devansh.Day59.controller;

import com.devansh.Day59.security.JwtUtil;
import com.devansh.Day59.security.RefreshTokenStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private RefreshTokenStore refreshTokenStore;

    @PostMapping("/login")
    public Map<String, String> login(@RequestParam String username) {

        String accessToken = ((JwtUtil) jwtUtil).generateAccessToken(username);
        String refreshToken = jwtUtil.generateRefreshToken(username);

        refreshTokenStore.save(refreshToken);

        return Map.of(
                "accessToken", accessToken,
                "refreshToken", refreshToken);
    }

    @PostMapping("/refresh")
    public Map<String, String> refresh(@RequestParam String refreshToken) {

        if (!refreshTokenStore.isValid(refreshToken)) {
            throw new RuntimeException("Invalid refresh token");
        }

        String username = jwtUtil.extractUsername(refreshToken);
        String newAccessToken = jwtUtil.generateAccessToken(username);

        return Map.of("accessToken", newAccessToken);
    }
}
