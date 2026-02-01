package com.devansh.Day62.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        javax.management.relation.Role role = username.equals("admin") ? Role.ADMIN : Role.USER;

        List<SimpleGrantedAuthority> authorities = RolePermissionMapper.getPermissions(role)
                .stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

        return new org.springframework.security.core.userdetails.User(
                username,
                "{noop}password",
                authorities);
    }
}
