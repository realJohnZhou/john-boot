package com.john.boot.common.dto;

import lombok.Data;

import java.util.Set;

/**
 * @author john
 */
@Data
public class AuthUser {
    /**
     * user id
     */
    private String userId;

    private String username;

    private String password;

    private String name;

    private String phone;

    private String email;

    private Set<String> roles;
}
