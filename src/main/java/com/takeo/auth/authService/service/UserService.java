package com.takeo.auth.authService.service;

import com.takeo.auth.authService.dto.UserDto;

public interface UserService {
    UserDto registerUser(UserDto user);

    UserDto findByEmail(String email);

    UserDto findByUsername(String username);

    UserDto getUserById(Long id);
}
