package com.takeo.auth.authService.repository;

import java.util.Optional;

import com.takeo.auth.authService.entity.Role;
import com.takeo.auth.authService.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName(RoleName roleName);

}
