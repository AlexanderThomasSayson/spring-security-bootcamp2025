package com.srllc.spring_security_bootcamp2025.domain.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
@Tag(name = "User Endpoints", description = "These are the endpoints that the user can access!")
public class UserEndpointController {

    @Operation(summary = "Show User Access", description = "This endpoint show the permission of a USER role.")
    @GetMapping("/get")
    public String showUserAccess(){
        return "Hello, you can access this because you have USER permission";
    }
}
