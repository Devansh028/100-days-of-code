package com.devansh.Day59.security;

import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class RefreshTokenStore {

    private final Set<String> refreshTokens = ConcurrentHashMap.newKeySet();

    public void save(String token) {
        refreshTokens.add(token);
    }

    public boolean isValid(String token) {
        return refreshTokens.contains(token);
    }

    public void revoke(String token) {
        refreshTokens.remove(token);
    }
}
