package com.devansh.Day62.security;

import java.util.*;

import javax.management.relation.Role;

public class RolePermissionMapper {

    public static List<String> getPermissions(Role role) {

        if (role == Role.ADMIN) {
            return List.of(
                    Permission.READ_USER,
                    Permission.WRITE_USER,
                    Permission.DELETE_USER,
                    Permission.READ_ADMIN);
        }

        return List.of(
                Permission.READ_USER);
    }
}
