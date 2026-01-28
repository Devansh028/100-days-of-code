package com.devansh.Day58.service;

import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        if (!username.equals("devansh")) {
            throw new UsernameNotFoundException("User not found");
        }

        return new User(
                "devansh",
                "",
                List.of(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
