package com.srllc.spring_security_bootcamp2025.domain.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/admins")
@Tag(name = "Admin Access Controller", description = "Endpoints for users with ADMIN ACCESS")
public class AdminController {

    @Operation(summary = "Show Admin Access Endpoint", description = "This endpoint shows the access rights of an admin!")
    @GetMapping("/get")
    public String showAdminAccess(){
        return "Hello, you can see this because you have ADMIN access";
    }
}
