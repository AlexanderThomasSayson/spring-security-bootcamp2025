package com.srllc.spring_security_bootcamp2025.domain.controller;

import com.srllc.spring_security_bootcamp2025.domain.dto.AuthResponseDto;
import com.srllc.spring_security_bootcamp2025.domain.dto.LoginDto;
import com.srllc.spring_security_bootcamp2025.domain.dto.UserRegistrationDto;
import com.srllc.spring_security_bootcamp2025.domain.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserRegistrationDto userRegistrationDto){
        String response = authService.userRegistration(userRegistrationDto);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@RequestBody LoginDto loginDto){
        AuthResponseDto response = authService.login(loginDto);
        return ResponseEntity.ok(response);
    }
}
