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
    /**
     * username
     */
    private String username;
    /**
     * password
     */
    private String password;
    /**
     * name
     */
    private String name;
    /**
     * phone
     */
    private String phone;
    /**
     * email
     */
    private String email;

    private Set<String> roles;
}
