package com.takeo.auth.authService.dto;

import com.takeo.auth.authService.enums.RoleName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Long userId;

    @NotBlank(message = "Name is required")
    @Pattern(
            regexp = "^[a-zA-Z ]{2,30}$",
            message = "Name must be 2–30 characters and contain only letters and spaces"
    )
    private String name;

    @NotBlank(message = "Username is required")
    @Pattern(
            regexp = "^[a-zA-Z0-9_.]{5,30}$",
            message = "Username must be 5–30 characters and can contain letters, numbers, underscores (_), and dots (.)"
    )
    private String username;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Pattern(
            regexp = "^[a-zA-Z0-9_.]{6,225}$",
            message = "Password must be 6–30 characters and can contain letters, numbers, underscores (_), and dots (.)"
    )
    private String password;

    @NotNull(message = "Role name is required")
    private RoleName roleName; // e.g., "ADMIN", "CUSTOMER"
}
