package com.srllc.spring_security_bootcamp2025.config.init;

import com.srllc.spring_security_bootcamp2025.domain.dao.RoleDao;
import com.srllc.spring_security_bootcamp2025.domain.entity.Role;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class RoleInitializer implements ApplicationRunner {

    private final RoleDao roleDao;

    private void createRoleIfNotExits(String roleName){
        if(roleDao.findByRoleName(roleName) == null){
            Role role = new Role();
            role.setRoleName(roleName);
            roleDao.save(role); // save into the database
            log.info("Role '{}' created successfully!", roleName);
        }
        else {
            log.info("Role '{}' already exist", roleName);
        }
    }

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        createRoleIfNotExits("USER");
        createRoleIfNotExits("ADMIN");
        createRoleIfNotExits("SUPER_ADMIN");
        createRoleIfNotExits("MANAGER");
    }
}
