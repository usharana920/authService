package com.takeo.auth.authService.entity;

import com.takeo.auth.authService.enums.RoleName;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RoleName roleName;

    // Optional: to access all users of this role
    @OneToMany(mappedBy = "role")
    private Set<User> users;
}
