package com.srllc.spring_security_bootcamp2025.domain.dao;

import com.srllc.spring_security_bootcamp2025.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    Role findByRoleName(String roleName);
}
