package com.takeo.auth.authService.dto;

import java.util.Set;

public class RegisterRequest {

    private String username;
    private String email;
    private String password;
    private String phone;
    private Set<String> roles; // ["CUSTOMER"]
}
